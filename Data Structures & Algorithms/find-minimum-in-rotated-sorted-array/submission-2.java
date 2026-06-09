class Solution {
    public int findMin(int[] nums) {
        int pivot = findpivot(nums);
        return nums[pivot + 1];
    }
    static int findpivot(int[] arr){
    int start = 0;
    int end = arr.length -1;
    if (arr[start] <= arr[end]) return -1;
    while(start <= end){
        int mid = start + (end - start) / 2;
        if(mid < end && arr[mid] > arr[mid+1]){
            return mid ;
        }
        else if (mid > start && arr[mid -1] > arr[mid]){
            return mid - 1;
        }
        else if (arr[start] == arr[mid] && arr[mid] == arr[end]){
            if(arr[start] > arr[start + 1]){
                return start;
            } 
            start++;
            if(arr[end - 1] > arr[end]){
                return end - 1;
            }end--;
        }
        else if( arr[start] > arr[mid]){
            end = mid -1;
        }
        else{
            start = mid + 1;
        }
    }
    return -1;
  }
}

