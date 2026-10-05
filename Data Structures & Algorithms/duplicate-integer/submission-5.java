class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> res = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(res.get(nums[i]) != null)
                return true;
            res.put(nums[i],i);
        }
        return false;
    }
}