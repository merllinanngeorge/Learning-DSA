class Solution {
    public int maxFrequencyElements(int[] nums) {
        int len = nums.length;
        int maxValue = nums[0];
        
        for(int i=0; i<len; i++)
        maxValue = Math.max(maxValue, nums[i]);

        int hash[] = new int[maxValue+1];

        for(int i=0; i<len; i++)
        hash[nums[i]]++;

        int maxFreq = Integer.MIN_VALUE;
        for(int i=0; i<=maxValue; i++)
        {
            maxFreq = Math.max(maxFreq, hash[i]);
        }

        int count = 0;
        for(int i=0; i<=maxValue; i++)
        {
            if(hash[i]==maxFreq)
            {
                count += maxFreq;
            }
        }
        return count;
    }
}