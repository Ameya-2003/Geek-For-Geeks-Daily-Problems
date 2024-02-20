class Solution
{
    static HashSet<String> set;
     static  boolean solve(int i,String s,Boolean dp[],int n){
        if(i>=n)
           return true;
        if(dp[i]!=null)
           return dp[i];
        for(int len=i;len<=n;len++){
            String str=s.substring(i,len);
            if(set.contains(str)&&solve(len,s,dp,n)){
               return dp[i]=true;
            }
        }   
        return dp[i]=false;
    }
    public static int wordBreak(int sn,String A, ArrayList<String> B )
    {
      int n=A.length();
        set=new HashSet<>();
        for(String str:B){
            set.add(str);
        }
        Boolean dp[]=new Boolean[n+1];
        if(solve(0,A,dp,n))
           return 1;
        return 0;   
    }
}
