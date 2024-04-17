

//User function Template for Java


class Solution {  
    static int countPairs(int arr[], int n) 
    {
         // Your code goes here
        // int temp [] = new int[n];
         //int count = 0;
         int i;
         for( i=0; i<n; i++){
             arr[i] = arr[i]*i;
         }
        i=n-2;
        int sum=0;
        int temp;
        int j;
        
        while(i>=0){
            if(arr[i]>arr[i+1]){
                sum+=bSearch(arr,i+1,n,arr[i]);
            }
            j=i;
            while((j<n-1)&& (arr[j]>arr[j+1])){
                temp=arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j++;
            }
            i--;
        }
         return sum;
         
    }
    public static int bSearch(int [] arr, int i, int j, int n){
        int high = j-1;
        int low = i;
        int mid = (low+high)/2;
        while(low<high){
            if(arr[mid]<n && arr[mid+1]>=n){
                break;
            }
            else if(arr[mid]<n && arr[mid+1]<n) {
                low=mid+1;
                mid=(low+high)/2;
                
            }
            else{
                high=mid-1;
                mid=(low+high)/2;
            }
        }
        return mid+1-i;
    }
}
