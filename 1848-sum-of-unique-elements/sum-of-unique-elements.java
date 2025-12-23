class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        int max = nums[0];

        for(int i=0; i<nums.length; i++)
        max = Math.max(max,nums[i]);

        int freq[] = new int[max+1];

        for(int i=0; i<nums.length; i++)
        freq[nums[i]]++;

        for(int i=0; i<=max; i++)
        {
            if(freq[i]==1)
            sum += i;
        }
        return sum;
    }
}