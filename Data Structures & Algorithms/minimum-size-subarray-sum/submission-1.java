class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int min_k = Integer.MAX_VALUE;
        int l = 0;
        for(int r = 0 ; r < nums.length ; r++){
             sum += nums[r];
            while(sum >= target){
                min_k = Math.min(min_k,r - l +1) ;
                sum -= nums[l];
                l++;
            }
        }
        return min_k == Integer.MAX_VALUE ? 0 : min_k;
    }
}