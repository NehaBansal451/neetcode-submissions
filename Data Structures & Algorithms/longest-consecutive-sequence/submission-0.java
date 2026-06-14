class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        int max = 1;

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            int current = nums[i];

            // try to build sequence from nums[i]
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == current + 1) {
                    current = nums[j];
                    count++;
                    j = -1; // restart search for next number
                }
            }

            max = Math.max(max, count);
        }

        return max;
    }
}
