import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IsomorphicStrings{
	public static void main(String[] args) {
	
	String str1 = "foo";
	String str2 = "bar";
	int len1 = str1.length();
	int len2 = str2.length();
	if(len1 != len2){
		System.out.println("False");
	}
	HashMap<Character, Character> map = new HashMap<Character, Character>();
	int i = 0;
	boolean flag = true;
	while(i < len1){
		char c1 = str1.charAt(i);
		char c2 = str2.charAt(i);
		if(map.containsKey(c1)){
			if(map.get(c1) == c2){
				i++;
			}
			else{
				flag = false;
				break;
			}
		}
		else{
			if(map.containsValue(c2)){
				flag = false;
				break;
			}
			else{
				map.put(c1, c2);
				i++;
			}
		}
	}

	if(flag)
		System.out.println("True");
	else
		System.out.println("False");


    }
}