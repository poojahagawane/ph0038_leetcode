class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] ans = new int[A.length][A.length];
        for(int i = 0; i < A.length; i++)   {
            int k = A.length - 1;
            for(int j = 0; j < A.length; j++)   {
                if(A[i][k] == 1)
                    ans[i][j] = 0;
                else
                    ans[i][j] = 1;
                k--;
            }
        }
        return ans;
    }
}
