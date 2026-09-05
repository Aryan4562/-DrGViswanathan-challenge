class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] a : dp){
            Arrays.fill(a,-1);
        }   
        return build_dp(dp,0,0,m,n);
    }
    public int build_dp(int[][] dp,int i,int j,int m,int n){
        if(i>=m || j>=n ){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(dp[i][j]==-1){
            dp[i][j]=build_dp(dp,i+1,j,m,n)+build_dp(dp,i,j+1,m,n);
            return dp[i][j];
        }
        return dp[i][j];
    }
}