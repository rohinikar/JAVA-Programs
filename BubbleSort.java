class BubbleSort{
	public static void main(String[] args){
		int[] arr = {7, 5, 2, 4, 3, 9};
		int len = arr.length;

		for(int j = 1; j < len; j++){
			for(int i = 0; i < (len - j); i++){
			    if(arr[i] > arr[i + 1]){
				    int temp = arr[i];
				    arr[i] = arr[i + 1];
				    arr[i + 1] = temp;
			    }

         
		    }
		}

		for(int i = 0; i < len; i++){
			System.out.print(arr[i] + " ");
		}

	}
}