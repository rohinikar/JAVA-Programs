import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TopKFreqElems{
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 2, 1, 3, 3, 3, 4};
		int k = 2;

		int len = arr.length;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = Integer.MIN_VALUE;

		for(int i = 0; i < len; i++){
			int num = arr[i];
			if(map.containsKey(num)){
				int count = map.get(num);
				map.put(num, count + 1);
			}
			else{
				map.put(num, 1);
			}
		}

		for(Integer key : map.keySet()){
			int cnt = map.get(key);
			max = Math.max(max, cnt);
		}

		ArrayList<Integer>[] array = (ArrayList<Integer>[]) new ArrayList[max + 1];
		for(int i = 0; i <= max; i++){
			array[i] = new ArrayList<Integer>();
		}

		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			int number = entry.getKey();
			int cnt = entry.getValue();
			array[cnt].add(number);
		}

		for(int i = max; i > 0; i--){
			if(array[i].size() > 0){
			    ArrayList<Integer> list = array[i];
			    for(int j = 0; j < list.size(); j++){
				    System.out.println(list.get(j));
				    k--;
				    if(k == 0)
					    return;
			    }
		    }
		}
	}
}