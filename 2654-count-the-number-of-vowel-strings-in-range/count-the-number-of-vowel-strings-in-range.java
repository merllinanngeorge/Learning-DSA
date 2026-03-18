class Solution {
    public boolean checkVowelString(String str)
    {
        str = str.toLowerCase();
        int len = str.length();
        char first = str.charAt(0);
        char last = str.charAt(len - 1);

        if((first == 'a' || first == 'e' ||first == 'i' || first == 'o' || first == 'u')  && (last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u'))
        return true;
        return false;

    }
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i=left; i<=right; i++)
        {
            if(checkVowelString(words[i]))
            count++;
        }
        return count;
    }
}