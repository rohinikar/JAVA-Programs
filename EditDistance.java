import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EditDistance{
	public static void main(String[] args){
		String s1 = "abc";
		String s2 = "abd";
		int len1 = s1.length();
		int len2 = s2.length();
		
		int[][] dp = new int[len1 + 1][len2 + 1];
		for(int i = 0; i < len1; i++){
			dp[i][0] = i;
		}
		for(int i = 0; i < len2; i++){
			dp[0][i] = i;
		}
		
		for(int i = 1; i <= len1; i++){
			char c1 = s1.charAt(i - 1);
			for(int j = 1; j <= len2; j++){
				char c2 = s2.charAt(j - 1);
				if(c1 == c2){
					dp[i][j] = dp[i - 1][j - 1];
				}
				else{
					int replace = dp[i - 1][j - 1] + 1;
					int add = dp[i][j - 1 ] + 1;
					int delete = dp[i - 1][j] + 1;
					dp[i][j] = Math.min(add, Math.min(delete, replace));
				}
			}
		}
		
		System.out.println(dp[len1][len2]);
	}
}