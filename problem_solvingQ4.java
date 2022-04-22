# Java_codes-
  class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int max=0;
        for(int i=0;i<n;i++){
            int sum=0; 
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }if(sum>=max) max=sum;
        }return max;
    }
}
