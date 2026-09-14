class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // HashMap<Integer, Integer> hmap = new HashMap<>();
        // for (int i =0; i< numbers.length; i++) {
        //     if (hmap.containsKey(target-numbers[i])) {
        //         return new int[]{hmap.get(target - numbers[i]), i+1};
        //     }
        //     hmap.put(numbers[i], i+1);
        // }
        // return new int[2];


        // O(1) space solution

        int l=0;
        int r = numbers.length-1;
        while (l <= r) {
            while ( l<= r && numbers[l] + numbers[r] > target) {
                r--;
            }

            while ( l<= r && numbers[l] + numbers[r] < target) {
                l++;
            }

            if (l>r) {
                break;
            }

            if (numbers[l] + numbers[r] == target) {
                return new int[]{l+1, r+1};
            }
        }
        return new int[2];
    }
}
