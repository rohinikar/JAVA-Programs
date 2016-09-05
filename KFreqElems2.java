import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class KFreqElems2{
	public static void main(String[] args) {
		int[] arr = {1, 2, 6, 3, 7, 4, 2, 1, 9, 9 ,9};
		int k =2;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr.length; i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i]) + 1);
			}
			else{
				map.put(arr[i], 1);
			}
		}

		int max = Integer.MIN_VALUE;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			max = Math.max(max, entry.getValue());
		}
		//System.out.println(max);

		ArrayList<Integer>[] array = (ArrayList<Integer>[])new ArrayList[max];
		for(int i = 0; i < max; i++){
			array[i] = new ArrayList<Integer>();
		}

		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			int num = entry.getKey();
			int count = entry.getValue();
			//System.out.println(num);
			//System.out.println(count);
			ArrayList<Integer> lst = array[count - 1];
			lst.add(num);
		}

		int cnt = 0;
		for(int i = max - 1; i >= 0; i--){
			if(cnt == k)
				break;
			else{
				ArrayList<Integer> list = array[i];
				for(Integer a : list){
					if(cnt != k){
						System.out.println(a);
						cnt++;
					}
				}
			}
		}

	}

}