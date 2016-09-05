import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class ReverseVowels{
	public static void main(String[] args) {
		HashSet<Character> s = new HashSet<Character>();
		s.add('a');
		s.add('e');
		s.add('i');
		s.add('o');
		s.add('u');
		s.add('A');
		s.add('E');
		s.add('I');
		s.add('O');
		s.add('U');

		String str = "californiA";
		System.out.println(str);
		char[] array = str.toCharArray();
		int i = 0;
		int j = str.length() - 1;

		while(i < j){
			while(!s.contains(array[i])){
				i++;
			}
			System.out.println(i);
			while(!s.contains(array[j])){
				j--;
			}
			System.out.println(j);

			if(i < j){
				char temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;

			}
		}
		System.out.println(String.valueOf(array));
		
	}
}