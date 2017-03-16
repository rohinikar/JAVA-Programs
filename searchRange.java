public class searchRange {
	public static void main(String[] args) {
		int[] res = new int[2];
		int[] input = {1, 8, 4, 3, 8, 7};
		res = rangeSearch(input, 2);
		System.out.println(res[0] + "   " + res[1]);
	}

	public static int[] rangeSearch(int[] arr, int target) {
		if(arr==null || arr.length==0 )
			return null;
		int[] result = new int[2];
		result[0] = -1;
		result[1] = -1;
		int j = 0;
		int i = 0;
		while (i< arr.length) {
			if(arr[i] == target) {
				if(j == 0) {
					result[j] = i;
					j++;
				}
				else {

				}
			}
			else {
				if(j == 1) {
					result[j] = i-1;
					break;
				}
				else {

				}
			}
			i = i + 1;
		}
		if(i== arr.length && (j==1)) 
			result[j] = i-1;
		return result;

	}

}
