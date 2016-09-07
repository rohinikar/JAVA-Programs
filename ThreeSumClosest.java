import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class ThreeSumClosest{
	public static void main(String[] args) {
		int[] arr = {-1, 2, 1, 4};
		int target = 1;
		int len = arr.length;
		Arrays.sort(arr);

		int result = 0;
		int min = Integer.MAX_VALUE;

		for(int i = 0; i < (len - 2); i++){
			int left = i + 1;
			int right = len - 1;

			while(left < right){
				int sum = arr[i] + arr[left] + arr[right];
				int diff = Math.abs(target - sum);
				if(diff == 0){
					System.out.println(sum);
				}

				if(diff < min){
					min = diff;
					result = sum;
				}

				if(sum > target){
					right--;
				}
				else{
					left++;
				}


			}
		}

		System.out.println(result);
	}
}