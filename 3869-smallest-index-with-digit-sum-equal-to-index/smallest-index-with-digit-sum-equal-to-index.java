class Solution {
    int sum(int num)
    {
        int sum=0;
        while(num>0)
        {
            sum = sum + num%10;
            num /=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int index = -1;
        int sum = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>9)
            {
                sum = sum(nums[i]);
                if(sum == i)
                {
                index = i;
                break;
                }
            }
            else if(i==nums[i])
            {
            index = i;
            break;
            }
        }
        return index;
    }
}