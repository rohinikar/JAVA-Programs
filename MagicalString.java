
public class MagicalString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		//System.out.println("Hello World");
		result = getLongest("<><>><><<>>>>>>>>>>>>>><>>><>>>>><<<<><>>>");
		System.out.println(result);

	}
	
	public static int getLongest(String s)
	{
		
		final int n = s.length();
		char[] a = s.toCharArray();
		int p = 0;
		int q = n-1;
		int countp = 0, countq = 0, finalcount = 0;
		int longestlength = 0;
		
		for(int i = 0; i < n; i++)
		{
			if(a[i] == '>')
			{
				p=i;
				break;
			}
		}
		for(int j = n-1; j >= 0; j--)
		{
			if(a[j] == '<')
			{
				q=j;
				break;
			}
		}
		
		if(p>=q)
			return 0;
		
		p = p + 1;
		q = q - 1;
		System.out.println("p: " + p + " q: " + q);
		while(p<q)
		{
			if(a[p] == '>')
				countp++;
			if(a[q] == '<')
				countq++;
			p = p + 1;
			q = q - 1;
		}
		if(p == q)
		{
			if(a[p] == '>')
				countp++;
			else 
				countq++;
		}
		System.out.println("countp :" + countp + " countq :" + countq);
		System.out.println("p: " + p + " q: " + q);
		if(countq < countp)
		{
			while(countq < countp)
			{
				if(a[--p] == '<')
					countq++;
				else if(a[--p] == '>')
					countp--;
			}
			//countq = countq - 1;
		}
		
		if(countp < countq)
		{
			while(countp < countq)
			{
				if(a[++q] == '>')
					countp++;
				else if(a[++q] == '<')
					countq--;
			}
			//countp = countp - 1;
		}
		System.out.println(countp);
		System.out.println(countq);
		finalcount = Math.min(countp, countq);
		longestlength = 2 + (finalcount * 2);
		return longestlength;
	}

}
