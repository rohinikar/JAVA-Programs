import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubstringWithConcatAllWords{
	public static void main(String[] args) {
		String str = "barfoothefoorbarman";
		String[] words = {"foo", "bar"};
		int len = words[0].length();
		HashSet<String> set = new HashSet<String>();

		for(int i = 0; i < words.length; i++){
			set.add(words[i]);
		}

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int start = 0;
		for(int i = 0; i <= str.length() - (len * words.length); i = i + len){
			String s = str.substring(i, i + len);
			if(set.contains(s)){
				if(map.containsKey(s)){
					int index = start;
					while(index < i){
						String a = str.substring(index, index + len);
						if(s.equals(a)){
							start = index + len;
						}
						else{
							map.remove(a);
							index = index + len;
						}
					}
				}
				else{
					map.put(s, 1);
					if(map.size() == words.length){
						System.out.println(start);
						String temp = str.substring(start, start + len);
						map.remove(temp);
						start = start + len;
					}
				}
			}
			else{
				map.clear();
				start = i + len;
			}
		}

		return;
	}
}