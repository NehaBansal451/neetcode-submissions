class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int  kUpper = findmaxOfArray( piles);
        int k = binarySearch(piles, h , 1, kUpper);
        return k ;
    }
    static int binarySearch(int[] arr, int h , int start , int end){
        int ans = end;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int  H = checkForH(arr , h, mid);
            if(H <= h){
              ans = mid; // store ans
               end = mid - 1; // try smaller ans
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
    static int checkForH(int[] arr, int h , int mid){
        int sum = 0;
        for(int i = 0; i < arr.length ; i++){
            int value = arr[i] / mid;
               sum += (arr[i] + mid - 1) / mid;
            }
        return sum ;
    }
    static int findmaxOfArray(int[] arr){
        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
