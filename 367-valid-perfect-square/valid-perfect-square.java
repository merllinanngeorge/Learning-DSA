class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 2;
        int right = num/2;
        int mid = 0;
        if(num<2)
        return true;
        while(left<=right)
        {
            mid = (left + right)/2;
            long squared = (long) mid * mid;
            if(squared == num)
            return true;
            else if(squared < num)
                left = mid + 1;
            else
                right = mid - 1; 
           
        }
        return false;
    }
}