class Solution {
    public int[] sortedSquares(int[] nums) {
        squaringOfEachElement(nums);
        Arrays.sort(nums);
        return nums;
        }
    
    static void squaringOfEachElement(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = arr[i]*arr[i];
        }
    }
}