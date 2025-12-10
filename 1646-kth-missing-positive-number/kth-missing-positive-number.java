class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missing=0;
        int i=0;
        int comp=1;
        while(k>0)
        {
            if(i<arr.length && comp==arr[i])
            {
                i++;
            }
            else
            {
                missing = comp;
                k--;
            }
            comp++;
        }
        return missing;
    }
}