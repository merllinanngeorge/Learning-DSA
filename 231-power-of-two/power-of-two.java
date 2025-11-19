class Solution {
    public boolean isPowerOfTwo(int n) {
        while(n>0)
        {
            if(n==1)
                return true;
            else if(n%2!=0)
                return false;
            else
                n /= 2;
        }
        return false;
    }
}