import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class LongestValidParen{
	public static void main(String[] args) {
		String str = "(()";
		int len = str.length();
		Stack<Integer> stack = new Stack<Integer>();
		int result = Integer.MIN_VALUE;
		boolean valid = false;
		int prevLen = 0;

		for(int i = 0; i< len; i++){
			char c = str.charAt(i);
			if(c == '('){
				stack.push(i);
			}
			else{
				if(stack.isEmpty()){
					valid = false;
					prevLen = 0;
				}
				else{
					int popped = stack.pop();
					int currLen = i - popped + 1;

					if(valid){
						currLen = currLen + prevLen;
						prevLen = currLen;
					}
					else{
						prevLen = currLen;
						valid = true;
					}
					
					result = Math.max(result, currLen);
				}
			}
		}

		System.out.println(result);
	}
}