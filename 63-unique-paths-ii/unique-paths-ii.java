class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int[] a: dp){
            Arrays.fill(a,-1);
        }
        return dp_builder(obstacleGrid,dp,0,0,m,n);
    }
    public int dp_builder(int[][] obstacleGrid,int[][] dp,int i,int j,int m,int n){
        if(i>=m || j>=n ){
            return 0;
        }
        else if(obstacleGrid[i][j]==1){
            return 0;
        }
        else if(i==m-1 && j==n-1){
            return 1;
        }
        else if(dp[i][j]==-1){
            dp[i][j]=dp_builder(obstacleGrid,dp,i+1,j,m,n)+dp_builder(obstacleGrid,dp,i,j+1,m,n);
            return dp[i][j];
        }
        return dp[i][j];
    }
}