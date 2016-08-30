class SelectionSort{
	public static void main(String[] args){
		int[] arr = {29, 64, 73, 34, 20};
		int len = arr.length;

		for(int i = 0; i < (len - 1); i++){
			int smallest = i;
			for(int j = (i + 1); j < len; j++){
				if(arr[j] < arr[smallest]){
					smallest = j;
				}
			}
			if(smallest != i){
				int temp = arr[smallest];
				arr[smallest] = arr[i];
				arr[i] = temp;
			}
		}

		for(int i = 0; i < len; i++){
			System.out.print(arr[i] + " ");
		}
	}
}