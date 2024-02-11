class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        ArrayList<Integer> sequence = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int prev = 0;
        
        sequence.add(0);
        set.add(0);
        
        for (int i = 1; i < n; i++) {
            int next = prev - i;
            if (next < 0 || set.contains(next)) {
                next = prev + i;
            }
            sequence.add(next);
            set.add(next);
            prev = next;
        }
        
        return sequence;
    }
}
