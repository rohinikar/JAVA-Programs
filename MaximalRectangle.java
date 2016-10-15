import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximalRectangle{
	public static void main(String[] args) {
		int[][] matrix = new int[][]{
			{1, 0, 1, 1, 1},
			{1, 0, 0, 0, 1},
			{1, 1, 1, 1, 1}
		};

		int rows = matrix.length;
		int cols = matrix[0].length;

		if(matrix == null)
			return;
		if(rows <= 0)
			return;

		int[][] dp = new int[rows][cols];
		for(int i = 0; i < cols; i++){
			dp[0][i] = matrix[0][i];
		}
		for(int i = 1; i < rows; i++){
			for(int j = 0; j < cols; j++){
				if(matrix[i][j] == 1){
					dp[i][j] = matrix[i][j] + dp[i - 1][j];
				}
				else{
					dp[i][j] = 0;
				}
			}
		}

		int max = Integer.MIN_VALUE;

		for(int i = 0; i < rows; i++){
			int maxArea = Integer.MIN_VALUE;
			Stack<Integer> stack = new Stack<Integer>();
			int j = 0;
			while(j < cols){
				if(stack.isEmpty() || dp[i][j] >= dp[i][j - 1]){
					stack.push(j);
					j++;
				}
				else{
					int top = stack.pop();
					maxArea = Math.max(maxArea, dp[i][top] * (stack.isEmpty() ? j : (j - stack.peek() - 1)));
				}
			}
			while(!stack.isEmpty()){
				int top = stack.pop();
				maxArea = Math.max(maxArea, dp[i][top] * (stack.isEmpty() ? j : (j - stack.peek() - 1)));
			}
			max = Math.max(max, maxArea);
		}

		System.out.println(max);
	}
}