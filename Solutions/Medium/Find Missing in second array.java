class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for(int num: b)
            mp.put(num, mp.getOrDefault(num, 0) + 1);
            
        for(int num: a)
            if(!mp.containsKey(num))
                res.add(num);
                
        return res;
 }
}
