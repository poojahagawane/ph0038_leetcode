class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];
        int left=0, right=A.length-1;
        for(int runner =0; runner < A.length; runner++)  {
            if(A[runner]%2 == 0)    {
                ans[left] = A[runner];
                left++;
            }
            else    {
                ans[right] = A[runner];
                right--;
            }
        }
        return ans;
    }
}
