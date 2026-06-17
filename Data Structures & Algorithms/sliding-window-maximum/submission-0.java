class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int l = 0;

        for (int r = 0; r < nums.length; r++) {

            // window formed
            if (r - l + 1 == k) {

                // find max in current window
                int max = Integer.MIN_VALUE;
                for (int i = l; i <= r; i++) {
                    max = Math.max(max, nums[i]);
                }

                list.add(max);
                l++; // slide window
            }
        }

        // convert list → array
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}