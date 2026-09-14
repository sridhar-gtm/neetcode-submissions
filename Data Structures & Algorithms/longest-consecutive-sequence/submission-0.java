class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hset = new HashSet<>();

        for (int i : nums) {
            hset.add(i);
        }

        int res = 0;

        for (int i : nums) {
            int n = i;
            // while (hset.contains(n)) {
            //     n--;
            // }
            if (hset.contains(n-1)) {
                continue;
            }
            int c = 0;
            if (n < i) {
                c = i - n -1;
                n = i;
            }
            while (hset.contains(n)) {
                n++;
                c++;
            }
            if(res<c) {
                res = c;
            }

        }
        return res;
    }
}
