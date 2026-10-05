class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> res = new HashSet<>();

        for(int num : nums)
            res.add(num);

        if(res.size() < nums.length)
            return true;

        return false;
    }
}