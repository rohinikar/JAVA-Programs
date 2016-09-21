import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ScrambledStrings{
	public static void main(String[] args) {
		String str1 = "great";
		String str2 = "rgtae";

		if(isScrambled(str1, str2))
			System.out.println("True");
		else
			System.out.println("False");
	}

	static boolean isScrambled(String s1, String s2){
		if(s1 == null && s2 == null)
			return true;
		if(s1 == null || s2 == null)
			return false;
		if(s1.length() != s2.length())
			return false;
		if(s1.equals(s2))
			return true;

		int first = 0;
		int last = s2.length() - 1;
		boolean flag = true;
		while(first < s1.length() && last >= 0){
			if(s1.charAt(first) != s2.charAt(last)){
				flag = false;
				break;
			}
			else
			{
				first++;
				last--;
			}
		}
		if(flag)
			return true;

		for(int i = 1; i < s1.length() - 1; i++){
			if(isScrambled(s1.substring(0, i), s2.substring(s2.length() - i)) && isScrambled(s1.substring(i), s2.substring(0, s2.length() - i)))
				return true;
		    if(isScrambled(s1.substring(0, i), s2.substring(0, i)) && isScrambled(s1.substring(i), s2.substring(i)))
				return true;
		}

		return false;
	}
}