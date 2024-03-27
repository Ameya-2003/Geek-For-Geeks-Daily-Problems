class Solution {
    
    static int[][]dirs = {{1,0},{-1,0},{0,1},{0,-1}}; 
    
    public static int findShortestPath(int[][] mat) {
        
        int n = mat.length, m = mat[0].length;
        
        Queue<int[]>queue = new LinkedList<>();
        
        /* leftmost columns check if one and adjacent nodes are not landmines then add in queue */
        
        for(int i=0;i<n;i++){
            if(mat[i][0]==1 && checkLandmines(mat,i,0,n,m))queue.add(new int[]{i,0,0});
        }
        
        /*  traverse all paths from leftmost col to rightmost col using queue and find shortest path */
        int ans = Integer.MAX_VALUE;
        while(!queue.isEmpty()){
            int[]arr = queue.poll();
            int row = arr[0], col = arr[1], dist = arr[2];
            
            /* mark visited */
            mat[row][col] = -1;
            
            /* path valid condition then store minimum */
            if(col == m-1)ans = Math.min(ans,dist+1);
            
            /* traverse all adjacent which is not landmines as well as not visited */
            for(int[]dir:dirs){
                int nrow = dir[0]+row;
                int ncol = dir[1]+col;
                
                /* visited and landmine condition */
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && mat[nrow][ncol]!=-1 && checkLandmines(mat,nrow,ncol,n,m)){
                    queue.add(new int[]{nrow,ncol,dist+1});
                }
            }
        }
        
        /* check for invalid case */
        if(ans == Integer.MAX_VALUE)return -1;
        
        return ans;
        
    }
    
    public static boolean checkLandmines(int[][]mat, int row, int col,int n, int m){
        for(int[]dir:dirs){
            int nrow = dir[0]+row;
            int ncol = dir[1]+col;
            
            /*  landmine condition */
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && mat[nrow][ncol]==0)return false;
        }
        return true;
    }
}
