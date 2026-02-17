class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count = 0;
        int bound = 0;
        for(int i=0; i<nums.length; i++)
        {
            bound += nums[i];
            if(bound == 0)
            count++;
        }
        return count;
    }
}