class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    
    public int grayToBinary(int n) {
        int result = n;
        while (n > 0) {
            n >>= 1;
            result ^= n;
        }
        return result;
    }
}

   
 
