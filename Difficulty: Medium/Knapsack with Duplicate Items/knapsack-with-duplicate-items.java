class Solution {
    public int knapSack(int val[], int wt[], int capacity) {
        int n = val.length;
        int[][] dp = new int[n+1][capacity+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=capacity;j++){
                int inc = 0,exc = 0;
                if(wt[i-1] <= j){
                    inc  = val[i-1] + dp[i][j-wt[i-1]];
                }
                exc = dp[i-1][j];
                dp[i][j] = Math.max(inc,exc);
            }
        }
        return dp[n][capacity];
    }
}