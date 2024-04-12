class Solution {
    static long pairAndSum(int n, long arr[]) {
        // 1. Create an array of size 32 to store frequency of set bits of arr[i]
        int setBit[]= new int[32];
        
        // 2. Initialize ans
        long ans=0l;
        
        // 3. Use 2 loops- one for traversing arr[i] and another for 0 to 32 to store
        // all set bits in our array 'setBit'
        // With storing the frequency, we will also be calculating ans
        for(int i=0; i<n; i++){
            long num= arr[i];
            
            for(int j=0; j<32; j++){
                
                // 4. Check if jth bit of num is set or not
                if((num & (1l << j))!=0){
                    
                    // 5. If set then ans will be calculated here itself
                    // First calculate product from that set bit
                    // It will be freq * Math.pow(2,j)
                    // then ans= ans + (product from set bit)
                    ans= ans+(setBit[j] * (long)Math.pow(2,j));
                    
                    // 6. Now increase update frequency for current loop set bit
                    setBit[j]++;
                }
            }
        }
        
        return ans;
    }
}
