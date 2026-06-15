class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        // count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    
    int n = nums.length;
    for (int key : map.keySet()) {
        if (map.get(key) > n / 3) {
            list.add(key);
        }
    }
    return list;
}
}