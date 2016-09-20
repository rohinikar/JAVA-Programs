import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReversePolish{
	public static void main(String[] args) {
		String[] arr = {"4","13","5","/","+"};
		int len = arr.length;
		Stack<Integer> stack = new Stack<Integer>();
		String operators = "+-*/";

		for(int i = 0; i < len; i++){
			int index = operators.indexOf(arr[i]);
			if(index < 0){
				int num = Integer.valueOf(arr[i]);
				stack.push(num);
			}
			else{
				int num1 = stack.pop();
				int num2 = stack.pop();

				switch(index){
					case 0:
					    stack.push(num1 + num2);
					    break;
					case 1:
					    stack.push(num1 - num2);
					    break;
					case 2:
					    stack.push(num1 * num2);
					    break;
					case 3:
					    if(num1 != 0)
					        stack.push(num2 / num1);
					    else
					    	stack.push(0);
					    break;
				}
			}
		}

		System.out.println(stack.pop());
	}
}