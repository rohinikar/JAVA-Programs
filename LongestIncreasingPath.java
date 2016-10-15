import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LongestIncreasingPath{
	public static void main(String[] args) {
		int[][] matrix = new int[][]{
			{5, 3, 7, 4, 8},
			{3, 2, 5, 7, 1},
			{6, 3, 1, 7, 2}
		};

		int rows = matrix.length;
		int cols = matrix[0].length;
		int max = Integer.MIN_VALUE;

		if(matrix == null)
			return;
		if(rows <= 0)
			return;

		int[][] dp = new int[rows][cols];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				dp[i][j] = Integer.MIN_VALUE;
			}
		}

		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				max = Math.max(max, dfs(i, j, matrix, dp));
			}
		}

		System.out.println(max);
	}

	public static int dfs(int row, int col, int[][] matrix, int[][] dp){

		if(dp[row][col] != Integer.MIN_VALUE){
			return dp[row][col];
		}

		int a = 0, b = 0, c = 0, d = 0;
		if(row - 1 >= 0){
		    if(matrix[row - 1][col] > matrix[row][col]){	
		        a = dfs(row - 1, col, matrix, dp);
		    }
		}
		if(row + 1 < matrix.length){
		    if(matrix[row + 1][col] > matrix[row][col]){	
		        b = dfs(row + 1, col, matrix, dp);
		    }
		}
		if(col - 1 >= 0){
		    if(matrix[row][col - 1] > matrix[row][col]){	
		        c = dfs(row, col - 1, matrix, dp);
		    }
		}
		if(col + 1 < matrix[0].length){
		    if(matrix[row][col + 1] > matrix[row][col]){	
		        d = dfs(row, col + 1, matrix, dp);
		    }
		}

		int max = Math.max(a, Math.max(b, Math.max(c, d)));
		dp[row][col] = max + 1;
		return max + 1;

	}
}