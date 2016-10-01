import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LongestCommonSubstring{
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abcd";

		int len1 = s1.length();
		int len2 = s2.length();

		if(s1 == null || s2 == null){
			System.out.println("0");
			return;
		}

		int[][] dp = new int[len1][len2];
		int max = 0;

		for(int i = 0; i < len1; i++){
			for(int j = 0; j < len2; j++){
				if(s1.charAt(i) == s2.charAt(j)){
					if(i == 0 || j == 0){
						dp[i][j] = 1;
					}
					else{
						dp[i][j] = dp[i - 1][j - 1] + 1;
					}

					max = Math.max(max, dp[i][j]);
				}
			}
		}

		System.out.println(max);
		
	}
}