import java.util.*;
import java.io.*;

public class Solution {
    public int majorityElement(int[] num) {
        Hashtable table = new Hashtable();
        
        if(num.length==1)
        {
            return num[0];
        }
        for(int i=0; i<num.length; i++)
        {
            if(table.containsKey(num[i]))
            {
                int count = (int)table.get(num[i]);
                if((count+1)>(num.length/2))
                {
                    return num[i];
                }
                else
                {
                    table.put(num[i], count+1);
                }
            }
            else
            {
                table.put(num[i], 1);
            }
        }
        return 0;
    }
}