class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int k = i + 1;

            while (k < nums.length - 2) {

                if (k > i + 1 && nums[k] == nums[k - 1]) {
                    k++;
                    continue;
                }

                long sum1 = (long) nums[i] + nums[k];

                int u = k + 1;
                int v = nums.length - 1;

                while (u < v) {
                    long sum2 = (long) nums[u] + nums[v];

                    if (sum2 == target - sum1) {
                        list.add(Arrays.asList(nums[i], nums[k], nums[u], nums[v]));
                        u++;
                        v--;

                        while (u < v && nums[u] == nums[u - 1]) u++;
                        while (u < v && nums[v] == nums[v + 1]) v--;
                    } 
                    else if (sum2 < target - sum1) {
                        u++;
                    } 
                    else {
                        v--;
                    }
                }
                k++;
            }
        }
        return list;
    }
}