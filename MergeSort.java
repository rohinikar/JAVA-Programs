class MergeSort{
	static int[] arr = {29, 20, 73, 34, 64};
	
	public static void main(String[] args){
		
		int len = arr.length;
		sort(0, len - 1);
    }

    static void sort(int begin, int end){
    	if(begin >= end)
    		return;
    	if(begin < end){
    		int mid = (begin + end)/2;
    		sort(begin, mid);
    		sort(mid + 1, end);
    		merge(begin, mid, end);
    	}


    }

    static void merge(int begin, int mid, int end){
		System.out.println("Begin = " + begin + "; Mid = " + mid + "; End = " + end);
    	int i = begin;
    	int j = mid + 1;
    	int[] array = new int[end - begin + 1];
    	int k = 0;
    	while((i <= mid) && (j <= end)){
    		if(arr[i] < arr[j]){
    			array[k] = arr[i];
    			i++;
    		}
    		else{
    			array[k] = arr[j];
    			j++;
    		}
			
    		k++;
    	}
		

    	while(i <= mid){
    		array[k] = arr[i];
    		i++;
    		k++;
    	}

    	while(j <= end){
    		array[k] = arr[j];
    		j++;
    		k++;
    	}

    	for(int a = 0; a < array.length; a++){
			arr[begin++] = array[a];
    		System.out.print(array[a] + " ");
    	}
    	System.out.println("");
    }


}