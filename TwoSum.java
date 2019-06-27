import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        // Arrays.sort(nums);
        // for(int i =0; i<nums.length; i++)    {
        //     for(int j =i+1; j<nums.length; j++)  {
        //         if(nums[i] + nums[j] == target) {
        //             result[0] = i;
        //             result[1] = j;
        //         }
        //     }
        // }
        // int i = 0;
        // int j = nums.length -1;
        // while(j>i) {
        //     if(nums[i] + nums[j] == target) {
        //         result[0] = i;
        //         result[1] = j;
        //         break;
        //     }  else if (nums[i] + nums[j] > target)    {
        //         j--;
        //     }   else    {
        //         i++;
        //     }
        // }
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
   //     int com = new int[nums.length];
        for(int i =0; i<nums.length; i++)   {
            int com = target - nums[i];
            if (map.containsKey(com))   {
                result[0] = map.get(com);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        
        return result;
    }
}
