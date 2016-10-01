import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FourSum{
	public static void main(String[] args) {
		int[] arr = {1, 0, -1, 0, -2, 2};
		int target = 0;
		int len = arr.length;
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(len < 4)
			return;
		Arrays.sort(arr);

		for(int i = 0; i < len - 3; i++){
			if(i == 0 || arr[i] != arr[i - 1]){
				for(int j = i + 1; j < len - 2; j++){
					if(j == i + 1 || arr[j] != arr[j - 1]){
						int k = j + 1;
				        int l = len - 1;

				        while(k < l){
					        int sum = arr[i] + arr[j] + arr[k] + arr[l];
					        if(sum == target){
						        ArrayList<Integer> list = new ArrayList<Integer>();
					            list.add(arr[i]);
					            list.add(arr[j]);
					            list.add(arr[k]);
					            list.add(arr[l]);
					            result.add(list);

					            k++;
					            l--;

					            while(arr[k] == arr[k - 1]){
					    	        k++;
					            }
					            while(arr[l] == arr[l + 1]){
					    	        l--;
					            }
					        }
					        else if(sum < target){
					        	k++;
					        }
					        else{
					        	l--;
					        }
					    }
				    }
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