class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
           int[] mix = merge(nums1, nums2);
            double result = median(mix);
            return result;
     }
    static int[] merge(int[] nums1, int[] nums2){
        int[] mix = new int[nums1.length + nums2.length];
        int i =0;
        int j =0;
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                mix[k] = nums1[i];
                i++;
            }
            else{
                mix[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i< nums1.length){
            mix[k] = nums1[i];
            i++;
            k++;
        }
         while(j< nums2.length){
             mix[k] = nums2[j];
             j++;
             k++;
         }
         return mix;
    }

    static double median(int[] mix){
        int l = 0;
        int h = mix.length - 1;
        int n = mix.length;
        int mid = l + (h -l) / 2;
        if(n % 2 != 0){
            return mix[mid];
        }
        else{
            double med = (mix[mid] + mix[mid+1]) / 2.0;
            return med;
        }
    }
}
