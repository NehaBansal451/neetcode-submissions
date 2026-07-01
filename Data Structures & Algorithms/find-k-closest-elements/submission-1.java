class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int right = binarySearch(arr, x);
        int left = right - 1;

        LinkedList<Integer> list = new LinkedList<>();

        while (k > 0) {

            if (left < 0) {
                list.addLast(arr[right]);
                right++;
            }
            else if (right >= arr.length) {
                list.addFirst(arr[left]);
                left--;
            }
            else if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                list.addFirst(arr[left]);
                left--;
            }
            else {
                list.addLast(arr[right]);
                right++;
            }

            k--;
        }

        return list;
    }

    static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}