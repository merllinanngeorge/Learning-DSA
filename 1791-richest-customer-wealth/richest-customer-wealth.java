class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for(int i=0; i<accounts.length; i++)
        {
            int counter = 0;
            for(int j=0; j<accounts[i].length; j++)
            {
                counter += accounts[i][j];
            }
            if(counter > wealth)
            wealth = counter;
        }
        return wealth;
    }
}