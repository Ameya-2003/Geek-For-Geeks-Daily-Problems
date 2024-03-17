class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        // add your code here
        int c=0;
        HashSet<Integer>set= new HashSet<>();
        for(int i:head2)set.add(i);
        for(int i:head1){
        
            if(set.contains(x-i))c++;
        }
        return c;
    }
}
