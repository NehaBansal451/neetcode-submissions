class Solution {
    public int[] productExceptSelf(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length; i++){
            int Prefix = prefix(nums , i-1);
            int Suffix = suffix(nums , i+1);
            list.add(Prefix * Suffix);
        }
        for(int i =0 ; i < nums.length ; i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
    static int prefix(int[] nums, int n ){
        int product = 1;
        while(n >= 0){
            product *= nums[n];
            n--;
        }
        return product;
    }
    static int suffix(int[] nums, int n ){
        int product = 1;
        while(n <  nums.length){
            product *= nums[n];
            n++;
        }
        return product;
    }
}  
