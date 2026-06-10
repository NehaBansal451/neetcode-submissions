class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: convert keys to list
        List<Integer> list = new ArrayList<>(map.keySet());

        // Step 3: sort based on frequency (descending)
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        // Step 4: take top k
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}