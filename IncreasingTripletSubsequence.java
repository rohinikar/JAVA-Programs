import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IncreasingTripletSubsequence{
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int len = arr.length;
		if(len < 3){
			System.out.println("False");
			return;
		}

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for(int i = 0; i < len; i++){
			int num = arr[i];
			if(num < smallest)
				smallest = num;
			else if(num < secondSmallest)
				secondSmallest = num;
			else{
				System.out.println("True");
				return;
			}
		}

		System.out.println("False");
		return;
	}
}