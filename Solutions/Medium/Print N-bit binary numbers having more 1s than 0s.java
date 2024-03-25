class Solution {
    ArrayList<String> NBitBinary(int N) {
        ArrayList<String>ans = new ArrayList<>();
        int total = (int)Math.pow(2,N);
        int len = total - (int)Math.pow(2,N-1);
        for(int i=1;i<=len;i++){
            String str = Integer.toBinaryString(total-i);
            if(isValid(str))ans.add(str);
        }
        return ans;
    }
    boolean isValid(String str){
        int one = 0,zero = 0;
        for(char c:str.toCharArray()){
            if(c=='0')zero++;
            else one++;
            if(one<zero)return false;
        }
        return one>=zero;
    }
}
