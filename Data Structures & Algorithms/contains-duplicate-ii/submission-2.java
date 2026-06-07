class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         HashSet<Integer> set = new HashSet<>();
         for( int r = 0 ; r < nums.length ; r++){
            if(r  > k ){
                set.remove(nums[r - k -1]);
            }
            if(set.contains(nums[r])){
                return true;
            }
            set.add(nums[r]);
         }
         return false;
             }
}