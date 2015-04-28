public class Solution {
    public int removeElement(int[] A, int elem) {
        int j=0;
        int i=0;
        while(i<A.length)
        {
            if(A[i]==elem)
            {
                i++;
            }
            else
            {
                A[j]=A[i];
                j++;
                i++;
            }
        }
        return j;
    }
}