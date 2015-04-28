import java.util.*;

public class Solution {
    public boolean isValid(String s) {
        char[] chararray = s.toCharArray();
        char[] characters = {')', ']', '}'};
        char[] characters1 = {'(', '[', '{'};
        Stack<Character> stack = new Stack<Character>();
        for(char c : chararray)
        {
            
            if(!(characters[0]==(c) || characters[1]==(c) || characters[2]==(c)))
            {
                stack.push(c);
            }
            else
            {
                if(!stack.empty())
                {
                char popped = stack.pop();
                if((popped == characters1[0]) && (c != characters[0]))
                return false;
                else if((popped == characters1[1]) && (c != characters[1]))
                return false;
                else if((popped == characters1[2]) && (c != characters[2]))
                return false;
                }
                else
                return false;
            }
           
        }
        if(stack.empty())
        return true;
        else
        return false;
    }
}