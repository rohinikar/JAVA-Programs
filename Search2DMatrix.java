import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Search2DMatrix{
	public static void main(String[] args) {
		int[][] matrix = new int[][]{
			{1, 3, 5, 7},
			{10, 11, 16, 20},
			{23, 30, 34, 50}
		};
		int target = 3;

		int rowLow = 0;
		int rowHigh = matrix.length;
		int rowMid = -1;
		int colLow = 0;
		int colHigh = matrix[0].length;
		int colMid = -1;

		while(true){
			if(colLow < 0 || colHigh > matrix[0].length || rowLow < 0 || rowHigh > matrix.length)
				break;
			colMid = (colLow + colHigh)/2;
			rowMid = (rowLow + rowHigh)/2;

			if(matrix[rowMid][colMid] == target){
				System.out.println("True");
				return;
			}
			else if(target < matrix[rowMid][colMid]){
				rowHigh = rowMid;
				colHigh = colMid;
			}
			else{
				rowLow = rowMid;
				colLow = colMid;
			}
		}

		System.out.println("False");
		return;
	}
}