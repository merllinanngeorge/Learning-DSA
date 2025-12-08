class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String strArray[] = s.split(" ");
        for(int i=0; i<strArray.length; i++)
        {
          StringBuilder str2 = new  StringBuilder(strArray[i]).reverse();
          str.append(str2);
          if(i!=strArray.length-1)
          str.append(" ");
        }
        return str.toString();
    }
}