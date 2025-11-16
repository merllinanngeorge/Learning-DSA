class Solution {
    public int[] numberGame(int[] nums) {
        int len = nums.length;
        int arr[] = new int[len];
        Arrays.sort(nums);
        for(int i=0; i<len-1; i+=2)
        {
            arr[i] = nums[i+1];
            arr[i+1] = nums[i];
        }
        if(len%2==1)
        {
            arr[len-1] = nums[len-1];
        }
        return arr;
    }
}