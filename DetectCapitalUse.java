class Solution {
    public boolean detectCapitalUse(String word) {
        int lastValue = 0;
        for(int i=0; i< word.length(); i++)   {
            if(word.charAt(i) - 'A' >= 0 && word.charAt(i) - 'A' < 26)   {            
                if(i > 0 && lastValue != 1)  {
                    return false;
                }
                lastValue = 1;

            } else  {
                if(i > 1 && lastValue != 0)  {
                    return false;
                }      
                lastValue = 0;
            }
        }
        return true;
    }
}
