# Java_codes-
  class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        int i=0,j=n,k=0;
        while(i<n){
            ans[i]=nums[i];
            i++;
        }while(j<2*n&&k<n){
            ans[j]=nums[k];
            j++;
            k++;
        }
        return ans;
    }
}
