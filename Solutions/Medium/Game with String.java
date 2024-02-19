class Solution{
    static int minValue(String s, int k){
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> b-a);
        for(char ch:map.keySet())
        {
            pq.offer(map.get(ch));
        }
        //System.out.println(pq);
        while(!pq.isEmpty() && k>0)
        {
            int fre=pq.poll();
            //System.out.println(fre);
            pq.offer(fre-1);
            k--;
        }
        //System.out.println(pq);
        int ans=0;
        while(!pq.isEmpty())
        {
            ans+=(int)(Math.pow(pq.poll(),2));
        }
        return ans;
    }
}
