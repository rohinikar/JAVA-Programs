import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ShortestPalindrome{
	public static void main(String[] args) {
		String str = "aacecaaa";
		int len = str.length();

		int mid = (0 + len - 1)/2;
		String palin1 = findShortestPalindrome(str, mid - 1, mid, mid + 1);
		String palin2 = findShortestPalindrome(str, mid - 1, mid, mid);

		if(palin1.length() < palin2.length()){
			System.out.println(palin1);
		}
		else{
			System.out.println(palin2);
		}
		return;

	}

   
    public static String findShortestPalindrome(String str, int left, int mid, int right){

		while(left >= 0){
			if(str.charAt(left) == str.charAt(right)){
				left--;
				right++;
			}
			else{
				mid--;
				left = mid - 1;
				right = mid + 1;
			}
		}

		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		while(right < str.length()){
			char c = str.charAt(right);
			sb.append(c);
			right++;
		}

		return sb.reverse().toString();
	}
}
