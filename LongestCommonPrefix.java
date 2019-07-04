class Solution {
    public String longestCommonPrefix(String[] strs) {
        int shortLen = Integer.MAX_VALUE;
        String shortest = "";
        for(String s : strs)    
        {
            if(s.length() < shortLen) 
            {
                shortLen = s.length();
                shortest = s;
            }
        }
        for(int j = 0; j < strs.length; j++)   
        {
            StringBuilder ans = new StringBuilder();
            for(int i = 0; i< shortest.length(); i++)
            {
                if(strs[j].charAt(i) == shortest.charAt(i)) 
                {
                    ans.append(strs[j].charAt(i));
                }
                else    
                {
                    break;
                }
            }
            shortest = ans.toString();
        }
        return shortest;
    }
}
