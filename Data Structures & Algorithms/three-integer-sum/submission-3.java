class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i< nums.length; i++) {
            // duplicates filter
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            List<List<Integer>> l = twoSum(nums, -nums[i], i+1, nums.length-1);
            if (Objects.nonNull(l)) {
                res.addAll(l);
            }
        }
        return res;
        
        // 2sum
    }

    public List<List<Integer>> twoSum(int[] nums, int t, int l, int r) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        while(l < r) {
            if (nums[l] + nums [r] == t) {
                res.add(Arrays.asList(-t, nums[l], nums[r]));
                l++;
                r--;
                while (l < r && nums[l] == nums[l-1]) {
                    l++;
                } 
                while (l < r && nums[r] == nums[r+1]) {
                    r--;
                }
                
            }

            if (nums[l] + nums[r] > t) {
                r--;
            }
            if (nums[l] + nums[r] < t) {
                l++;
            }
        }
        return res;
    }
}
