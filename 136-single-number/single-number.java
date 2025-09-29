class Solution {
    public int singleNumber(int[] nums) {
        int freq[] = new int[nums.length];
        int single = 0;
        int len = nums.length;
        Arrays.fill(freq, 0);
        
        for(int i=0; i<len; i++)
        {
            int count=1;
            if(freq[i]!=-1)
            {
                for(int j=i+1; j<len; j++)
                {
                    if(nums[i] == nums[j])
                    {
                        count++;
                        freq[j] = -1;
                    }
                }
                freq[i] = count;
            }
        }
        for(int i=0; i<len; i++)
        {
            if(freq[i] == 1)
            single = nums[i];
        }

        return single;
    }
}