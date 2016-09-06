import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class LengthOfLastWord{
	public static void main(String[] args) {
		String str = "I am going to ";
		int len = str.length();
		if((str == null) || len == 0)
			System.out.println("0");
		int last = len - 1;
		boolean hasWord = false;
		int result = 0;

		while(last >= 0){
			char c = str.charAt(last);
			if(c == ' '){
				if(hasWord){
					System.out.println(result);
					return;
				}
				else{
					last--;
				}
			}
			else{
				result++;
				if(!hasWord){
					hasWord = true;
				}
				last--;
			}

		}
		System.out.println(result);


	}
}