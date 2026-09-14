class Solution {
    public int maxArea(int[] heights) {
        int a = 0, b = 0;
        int l=1, r =heights.length;
        while ((l-1) < (r-1)) {
            b = (r-l) * Math.min(heights[l-1], heights[r-1]);
            if (a < b) {
                a = b;
            }
            if (heights[l-1]> heights[r-1]) {
                r--;
            } else {
                l++;
            }
        }
        return a;
    }
}
