class Solution{
    static int mod = 1000000007;
    static long sequence(int n){
        
        long ans = findAns(n,1,1);
        return ans;
    }
    public static long findAns(int n,int start,int curr){
        
        if(start>n){
            return 0;
        }
        long ans = 0;
        ans = findAns(n,start+1,curr+start);
        
        long val = 1;
        for(int i=curr;i<start+curr;i++){
            val *= i;
            val = val%mod; 
        }
        return (ans+val)%mod;
        
    }
}
