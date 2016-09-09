import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class PascalTriangle{
    public static void main(String[] args){
	    int numRows = 5;
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
				
		for(int i = 0; i < numRows; i++){
		    if(i == 0){
			    ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(1);
				result.add(temp);
			}
			else if(i == 1){
			    ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(1);
				temp.add(1);
				result.add(temp);
			}
			else{
			    ArrayList<Integer> prev = result.get(i - 1);
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(1);
				for(int j = 0; j < prev.size() - 1; j++){
				    temp.add(prev.get(j) + prev.get(j + 1));
				}
				temp.add(1);
				result.add(temp);
			}
			
		}
		
		for(int i = 0; i < result.size(); i++){
		    ArrayList<Integer> list = result.get(i);
			for(int j = 0; j < list.size(); j++){
			    System.out.print(list.get(j) + " ");
			}
			System.out.println("");
		}
	}
}