class Solution
{
    int  subsequenceCount(String s, String t)
    {
	// Your code here
	 int n = s.length();
    int m  = t.length();
 
    int mod = (int) (1e9 + 7);
 
    int dp[][] = new int[n + 1][m + 1];
    for(int i = 0;i <=n;i++)
    {
        dp[i][0] = 1;
    }
    for(int i = 1;i <=n;i++)
    {
        for(int j =1;j <=m;j++)
        {
            if(s.charAt(i -1) == t.charAt(j -1 ))
            {
                dp[i][j] = (dp[i -1][j -1] + dp[i -1][j] )%mod; 
            }else
            {
                dp[i][j] = dp[i-1][j] %mod;
            }
        }
    }
    return dp[n][m];
    }
}
