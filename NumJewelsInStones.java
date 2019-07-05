class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<Character>();
        int count = 0;
        for(char j : J.toCharArray())   {
            set.add(j);
        }
        for(char s : S.toCharArray())  {
            if(set.contains(s)) {
                count++;
            }
        }
        return count;
    }
}
