import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UniquePaths{
	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		int rows = matrix.length;
		int cols = matrix[0].length;

		int[][] dp = new int[rows][cols];
		dp[0][0] = 0;

		for(int i = 1; i < rows; i++){
			dp[i][0] = 1;
		}
		for(int i = 1; i < cols; i++){
			dp[0][i] = 1;
		}

		for(int i = 1; i < rows; i++){
			for(int j = 1; j < cols; j++){
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}

		System.out.println(dp[rows - 1][cols - 1]);
	}
}