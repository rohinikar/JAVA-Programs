import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumPathSum{
	public static void main(String[] args) {
		int[][] matrix = new int[][]{
			{5, 3, 7, 4, 8},
			{3, 2, 5, 7, 1},
			{6, 3, 1, 7, 2}
		};

		int rows = matrix.length;
		int cols = matrix[0].length;

		if(matrix == null)
			return;
		if(rows <= 0)
			return;

		int[][] dp = new int[rows][cols];
		dp[0][0] = matrix[0][0];

		for(int i = 1; i < cols; i++){
			dp[0][i] = dp[0][i - 1] + matrix[0][i];
		}
		for(int i = 1; i < rows; i++){
			dp[i][0] = dp[i - 1][0] + matrix[i][0];
		}

		for(int i = 1; i < rows; i++){
			for(int j = 1; j < cols; j++){
				dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + matrix[i][j];
			}
		}

		System.out.println(dp[rows - 1][cols - 1]);
	}
}