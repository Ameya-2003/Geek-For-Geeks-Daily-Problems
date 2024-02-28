class Solution{
    int DivisibleByEight(String s){
        if(s.length()>3){
          String a=s.substring(s.length()-3);
          int r=Integer.parseInt(a);
          if(r%8==0){
             return 1;
          }
          else{
              return -1;
          }
      }
      else{
          int d=Integer.parseInt(s);
          if(d%8==0)
          return 1;
          else
          return -1;
      }
    }
}
