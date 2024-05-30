class Solution{
    static int evenlyDivides(int N){
        int x = N;
        int count = 0;
        while(x>0){
            if((x%10 >0) && (N%(x%10) == 0)){
                count++;
            }
            x/=10;
        }
        return count;
    }
