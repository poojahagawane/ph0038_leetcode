class Solution {
    public String reverseWords(String s) {
        String[] wordsarr = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(String word : wordsarr) {
            ans.append(new StringBuilder(word).reverse());
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}
