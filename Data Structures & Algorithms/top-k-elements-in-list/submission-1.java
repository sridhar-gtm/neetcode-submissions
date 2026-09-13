class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer, Integer> hmap = new HashMap<>();

      // frequency count
      for(int i: nums) {
        hmap.put(i, hmap.getOrDefault(i, 0) + 1);
      }

      // bucket frequency sort, used bucket of ArrayList as there could be integers with same frequency
      List<List<Integer>> bucket = 
                new ArrayList<List<Integer>>(nums.length + 1);
        // prepopulate for null pointer
        for (int i =0;i<=nums.length; i++)
        {
            bucket.add(new ArrayList<>());
        }
      for (Map.Entry<Integer, Integer> e : hmap.entrySet()) {
        bucket.get(e.getValue()).add(e.getKey());
      }

    // get k most frequent back now.

      int result[] = new int[k];
      int cnt = 0;
      for (int l= nums.length; l >=0 ; l--) {

            for (int x : bucket.get(l)) {
                result[cnt++] = x;
                if (cnt == k) {
                    return result;
                }
            }
      }
      return result;
    }
}
