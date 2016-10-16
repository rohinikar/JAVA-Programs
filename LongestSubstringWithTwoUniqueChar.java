import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LongestSubstringWithTwoUniqueChar{
	public static void main(String[] args) {
		String str = "abcbbbbcccbdddadacb";
		int len = str.length();
		String longestSubstring = "";
		int maxLength = Integer.MIN_VALUE;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		int start = 0;
		int i = 0;
		while(i < len){
			char c = str.charAt(i);
			if(map.containsKey(c)){
				int count = map.get(c);
				map.put(c, count + 1);
			}
			else{
				int index = start;
				map.put(c, 1);
				if(map.size() > 2){
					while(index < i){
						char a = str.charAt(index);
						int cnt = map.get(a);
						if(cnt == 1){
							map.remove(a);
							String sub = str.substring(start, i);
							if(sub.length() > maxLength){
								maxLength = sub.length();
								longestSubstring = sub;
							}
							start = index + 1;
							break;
						}
						else{
							map.put(a, cnt - 1);
							index++;
						}
					}
				}
			}
			i++;
		}

		String sb = str.substring(start, len);
		if(sb.length() > maxLength){
			maxLength = sb.length();
			longestSubstring = sb;
		}

		System.out.println(longestSubstring);
	}
}