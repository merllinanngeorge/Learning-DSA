class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int gcd=0;

        for(int i=1; i<nums.length; i++)
        {
            if(max<nums[i])
            max = nums[i];
            if(min>nums[i])
            min = nums[i];
        }
        for(int i=1; i<=min; i++)
        {
            if(min%i == 0 && max%i == 0)
            {
                gcd=i;
            }
        }
        return gcd;
    }
}