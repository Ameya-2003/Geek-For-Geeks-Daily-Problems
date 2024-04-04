class Solution
{
    //Function to find sum of all possible substrings of the given string.
    public static long sumSubstrings(String s)
    {
    //Your code here
    int MOD = 1000000007;
    long ans = 0;
    long curr = 0;
    for(int i=0;i<s.length();i++){
        curr = (curr * 10 + (i + 1) * (s.charAt(i) - '0')) % MOD;
        ans = (ans + curr) % MOD;
    }
    return ans;
    }
}
