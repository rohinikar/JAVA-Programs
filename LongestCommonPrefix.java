import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class LongestCommonPrefix{
	public static void main(String[] args) {
		String[] str = {"dog", "dogg", "doggy"};
		String result = longestCommonPrefix(str);
		System.out.println(result);
	}

	public static String longestCommonPrefix(String[] str){
		int least = Integer.MAX_VALUE;
		for(int i = 0; i < str.length; i++){
			least = Math.min(least, str[i].length());
		}	
		for(int i = 0; i < least; i++){
			char c = str[0].charAt(i);
			for(int j = 1; j < str.length; j++){
				if(c != str[j].charAt(i)){
					return str[0].substring(0, i);
				}
			}
		}

		return str[0].substring(0, least);
	}
}