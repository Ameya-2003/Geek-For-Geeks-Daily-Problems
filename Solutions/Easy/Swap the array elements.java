class Solution
{
    public void swapElements(int[] arr, int n)
    {
        if(arr.length<3)return;
        // Code here
        int i=0;int j=i+2;
        while(j<arr.length){
            swap(arr,i,j);
            i++;j++;
        }
    }
    public static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
