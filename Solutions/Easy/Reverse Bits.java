class Solution {
    static Long reversedBits(Long x) {
        long ans=0;
        int pow=31;
        while(x>0){
            if((x&1)==1){
                ans+=Math.pow(2,pow);
            }
            x=x>>1;
            pow--;
        }
        return ans;
    }
};
