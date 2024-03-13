class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        
        int n= mat.length,c=0;
        
        int[] arr = new int[n*n];
        
        
        int  mode = 0, lower = 0; 
       for (int start = 0; start < (2 * n - 1); start++) { 
            int m = start; 
            if (m >= n) { 
                mode++; 
                m = n - 1; 
                lower++; 
            } 
            else { 
                lower = 0; 
            } 
            for (int i = m; i >= lower; i--) { 
                if ((m + mode) % 2 == 0) { 
                    arr[c++] =mat[i][m + lower - i]; 
                } 
                else { 
                    arr[c++]= mat[m + lower - i][i]; 
                } 
            } 
        } 
        
        return arr;
        
    }
}
