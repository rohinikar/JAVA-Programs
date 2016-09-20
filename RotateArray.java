import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RotateArray{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int n = arr.length;
		int k = 3;
		reverse(arr, 0, n - k - 1);
		reverse(arr, n - k, n - 1);
		reverse(arr, 0, n - 1);

		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
	}

	static void reverse(int[] a, int begin, int end){
		while(begin < end){
			int temp = a[begin];
			a[begin] = a[end];
			a[end] = temp;
			begin++;
			end--;
		}
	}
}