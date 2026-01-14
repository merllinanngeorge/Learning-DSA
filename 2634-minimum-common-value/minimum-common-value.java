class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int len1 = 0;
        int len2 = 0;
        while(len1<nums1.length && len2<nums2.length)
        {
            if(nums1[len1] == nums2[len2])
            return nums1[len1];
            if(nums1[len1] < nums2[len2])
            len1++;
            else
            len2++;
        }
        return -1;
    }
}