class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        List<Integer> ans = new ArrayList<Integer>();
        while(left <= right)   {
            if(left < 10)
            {
                ans.add(left);
            }
            else if(checkTrue(left))   
            {
                ans.add(left);
            }
            left++;
        }
        return ans;
    }
    
    public boolean checkTrue(int num)
    {
        int orig = num;
        int digit;
        while(num > 0)  
        {
            digit = num % 10;
            if(digit == 0)  
            {
                return false;
            }
            else if(orig % digit != 0)
            {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}
