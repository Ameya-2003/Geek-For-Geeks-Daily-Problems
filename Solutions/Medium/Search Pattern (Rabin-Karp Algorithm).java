class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
       ArrayList<Integer> list = new ArrayList<>();
       int index = text.indexOf(pattern);
       while(index!=-1)
       {
           list.add(index+1);
           index = text.indexOf(pattern,index+1);
       }
       return list;
    }
}
