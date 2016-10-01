import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ThreeSum{
	public static void main(String[] args) {
		int[] arr = {-1, 0, 1, 2, -1, -4};
		int len = arr.length;
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(len < 3)
			return;
		Arrays.sort(arr);

		for(int i = 0; i < len - 2; i++){
			while(i != 0 && arr[i] == arr[i - 1] && i < len){
				i++;
			}
			if(i == len){
				return;
			}
			int j = i + 1;
			int k = len - 1;

			while(j < k){
				int sum = arr[i] + arr[j] + arr[k];
				if(sum == 0){
					ArrayList<Integer> list = new ArrayList<Integer>();
					list.add(arr[i]);
					list.add(arr[j]);
					list.add(arr[k]);
					result.add(list);
					j++;
					k--;

					while(arr[j] == arr[j - 1]){
						j++;
					}
					while(arr[k] == arr[k - 1]){
						k--;
					}

				}
				else if(sum < 0){
					j++;
				}
				else{
					k--;
				}
			}

		}

		for(int i = 0; i < result.size(); i++){
			ArrayList<Integer> list = result.get(i);
			for(int j = 0; j < list.size(); j++){
				System.out.print(list.get(j) + " ");
			}
			System.out.println("");
		}
	}
}