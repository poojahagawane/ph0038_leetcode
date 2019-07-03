class Solution {
    public int titleToNumber(String s) {
        int ans = 0;
        if(s.length() == 0) return ans;
        int index = 1;
        for(int i = s.length()-1; i >= 0; i--)  {
            ans = ans + index * (s.charAt(i) - 'A' + 1);
            index = index * 26;
        }
        return ans;
    }
}
