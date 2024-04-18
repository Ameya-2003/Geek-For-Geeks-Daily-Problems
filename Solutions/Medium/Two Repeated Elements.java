

//User function template for JAVA

class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int n)
    {
        // Your code here
        
        int[] ans = new int[2];
        int idx = 0;
        int[] freq = new int[n + 1];
        
        for (int i=0; i < n + 2; i++) {
            freq[arr[i]]++;
            
            if (freq[arr[i]] > 1) {
                ans[idx++] = arr[i];
            }
        }
        
        return ans;
    }
    
}
