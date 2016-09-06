import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class TwoSumIII{
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		add(1);
		add(3);
		add(5);
		boolean flag = find(4);
		if(flag)
			System.out.println("True");
		else
			System.out.println("False");
		flag = find(7);
		if(flag)
			System.out.println("True");
		else
			System.out.println("False");
	}

	public static void add(int num){
		if(map.containsKey(num)){
			map.put(num, map.get(num) + 1);
		}
		else{
			map.put(num, 1);
		}
	}


	public static boolean find(int num){
		for(Integer i : map.keySet()){
			int rem = num - i;
			if(map.containsKey(rem)){
				if((rem == i) && (map.get(i) < 2)){
					continue;
				}
				else{
					return true;
				}
			}
		}
		return false;
	}
}