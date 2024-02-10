class Solution {
    private int f(int i,int j,int target,int [][]arr,int k,int [][][]dp)
    {
        if(i==0 && j==0)
        {
            if(k-target==arr[0][0])
                return 1;
            return 0;
        }
        if(target>k)
            return 0;
        if(dp[i][j][target]!=-1)
            return dp[i][j][target];
        int up=0;
        if(i>=1)
        {
            up=f(i-1,j,target+arr[i][j],arr,k,dp);
        }
        int left=0;
        if(j>=1)
        {
            left=f(i,j-1,target+arr[i][j],arr,k,dp);
        }
        return dp[i][j][target]=up+left;    
    }
    long numberOfPath(int n, int k, int [][]arr) {
        // code here
        int [][][]dp=new int[n][n][k+1];
        for(int [][]val:dp)
            for(int []val2:val)
                Arrays.fill(val2,-1);
        return f(n-1,n-1,0,arr,k,dp);
    }
}
