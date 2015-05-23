import java.util.*;

public class simplifyPath {
	public static void main(String[] args) {
		String s = "/";
		String res = pathSimplify(s);
		System.out.println(res);
	}

	public static String pathSimplify(String s) {
		if(s==null || s.length()==0) 
			return null;
		while(s.length()>0 && s.charAt(s.length()-1)=='/')
			s=s.substring(0, s.length()-1);
		Stack<String> stack = new Stack<String>();
		int start = 0;
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i)=='/') {
				stack.push(s.substring(start, i));
				start = i;
			}
			else if(i==s.length()-1) {
				stack.push(s.substring(start));
			}
		}
		int back = 0;
		ArrayList<String> result = new ArrayList<String>();
		while(!stack.isEmpty()) {
			String cur = stack.pop();
			if(cur.equals("/.."))
				back = back + 1;
			else if(cur.equals("/") || cur.equals("/.")) {

			}
			else {
				if(back>0)
					back = back - 1;
				else
					result.add(cur);
			}
		}
		if(result.size()==0)
			return "/";
		StringBuilder sb = new StringBuilder();
		for(String str : result)
			sb.append(str);
		return sb.toString();

	}
}