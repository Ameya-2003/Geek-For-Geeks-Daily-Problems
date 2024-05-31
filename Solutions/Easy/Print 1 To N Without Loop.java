class Solution
{
  int n=1;
  static void fun(int N)
  {
    if(n>N)
    {
      return;
    }
  }

  System.out.print(n+" ");
  n++;
  fun(N);
  
}
