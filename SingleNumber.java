class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length % 2 == 0 )  return 0;
        if(nums.length == 1)  return nums[0];

//         HashSet<Integer> set = new HashSet<Integer>();  
        
//         for(int i = 0; i<nums.length; i++)    {
//             if(set.contains(nums[i]))   {
//                 set.remove(nums[i]);
//             }   else    {
//                 set.add(nums[i]);
//             }
//         }
        
//         return set.iterator().next();
        
        int uncommon = 0;
        for(int i : nums)    {
            uncommon ^= i;
        }
        return uncommon;
    }
}
