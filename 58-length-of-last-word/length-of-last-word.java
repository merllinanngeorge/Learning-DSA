class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        String[] str1 = str.split(" ");
        int len = str1.length;
        return str1[len-1].length();
    }
}