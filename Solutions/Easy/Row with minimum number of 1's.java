// User function Template for Java

class Solution {
    int minRow(int n, int m, int a[][]) {
        // code here
        int rk  = n+m, ind = 0;
        for(int i =0; i<n;i++){
            int  t =0;
            for(int j =0; j<m;j++)
                if( a[i][j] == 1) t++;
            if( t< rk){
                rk =t;
                ind =i;
            }
        }
        return ind+1;
    }
};
