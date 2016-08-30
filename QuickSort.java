class QuickSort{
	static int[] arr = {29, 20, 73, 64, 34, 17, 90};
	
	public static void main(String[] args){
		
		int len = arr.length;
		sort(0, len - 1);
	}
	
	static void sort(int begin, int end){
		if(begin >= end)
			return;
		System.out.println("Begin = " + begin + "; End = " + end);
		int partitionIndex = partition(begin, end);
		System.out.println("Partition = " + partitionIndex);
		sort(begin, partitionIndex - 1);
		sort(partitionIndex + 1, end);
		
		
		
	}
	
	static int partition(int begin, int end){
		if(begin >= end)
			return begin;
		
		int elem = arr[begin];
		int i = begin + 1;
		int j = end;
		while(i < j){
			while((i <= end) && (arr[i] < elem)){
				i++;
			}
			while((j >= begin) && (arr[j] > elem)){
				j--;
			}
			if(i < j){
			    int temp = arr[i];
			    arr[i] = arr[j];
			    arr[j] = temp;
			    i++;
			    j--;
			}
		}
		
		if(arr[j] < arr[begin]){
		    arr[begin] = arr[j];
		    arr[j] = elem;
		}
		
		for(int a = 0; a < arr.length; a++){
			System.out.print(arr[a] + " ");
		}
		System.out.println("");
		
		return j;
		
	}
}