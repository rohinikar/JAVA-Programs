import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class FlipGame{
	public static void main(String[] args){
		String str = "++--++--";
		ArrayList<String> list = new ArrayList<String>();
		char[] arr = str.toCharArray();

		for(int i = 0; i < arr.length - 1; i++){
			if((arr[i] == '+') && (arr[i + 1] == '+')){
				arr[i] = '-';
				arr[i + 1] = '-';
				list.add(new String(arr));
				arr[i] = '+';
				arr[i + 1] = '+';
			}
		}

		for(String s : list){
			System.out.println(s);
		}
	}
}