class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        digits[digits.length-1] = digits[digits.length-1] + 1;
        for(int i = digits.length-1; i >= 0; i--)   {
            digits[i] = digits[i] + carry;
            carry = 0;
            if(digits[i] > 9)   {
                carry = 1;
                digits[i] = digits[i] % 10;
            }
        }
        if(carry == 1)  {
            int[] ans = new int[digits.length+1];
            ans[0] = 1;
            for(int i =1; i < digits.length; i++ )  {
                ans[i] = digits[i-1];
            }
            return ans;
        }
        return digits;
    }
}
