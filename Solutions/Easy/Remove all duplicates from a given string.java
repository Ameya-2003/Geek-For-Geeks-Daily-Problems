class Solution {
    String removeDuplicates(String str) {
        StringBuilder ans = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                ans.append(ch);
            }
        }
        String s = ans.toString();
        return s;
    }
}
