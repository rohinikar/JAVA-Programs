class InsertionSort{
	public static void main(String[] args){
		int[] arr = {29, 20, 73, 34, 64};
		int len = arr.length;

		for(int i = 1; i < len; i++){
			int temp = arr[i];
			for(int j = (i - 1); j >= 0; j--){
				if(arr[i] < arr[j]){
					arr[j + 1] = arr[j];
				}
				else{
					arr[j + 1] = temp;
					break;
				}
			}
			if(arr[0] > temp){
				arr[0] = temp;
			}
		}

		for(int i = 0; i < len; i++){
			System.out.print(arr[i] + " ");
		}
	}
}