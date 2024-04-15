class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
         int[] res = new int[q];
        int i=0;
        Arrays.sort(b);
        for(int x : query){
            int count = 0;
            for(int j=0; j<n; j++) if(b[j] <= a[x]) count++; else break;
            res[i++] = count;
        }
        return res;
        

    }
}
