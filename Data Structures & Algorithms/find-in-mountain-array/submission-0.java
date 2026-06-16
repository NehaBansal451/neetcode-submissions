class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int pivot = findGreatest(mountainArr);

        int left = binarySearch(target, mountainArr, 0, pivot);
        if (left != -1) return left;

        return binarySearchInRight(target, mountainArr, pivot + 1, mountainArr.length() - 1);
    }

    static int binarySearch(int target, MountainArray mountainArr, int l, int h) {

        while (l <= h) {
            int mid = l + (h - l) / 2;
            int val = mountainArr.get(mid);

            if (val == target) return mid;
            else if (val < target) l = mid + 1;
            else h = mid - 1;
        }
        return -1;
    }

    static int binarySearchInRight(int target, MountainArray mountainArr, int l, int h) {

        while (l <= h) {
            int mid = l + (h - l) / 2;
            int val = mountainArr.get(mid);

            if (val == target) return mid;
            else if (val < target) h = mid - 1; // reverse logic
            else l = mid + 1;
        }
        return -1;
    }

    static int findGreatest(MountainArray mountainArr) {

        int l = 0;
        int h = mountainArr.length() - 1;

        while (l < h) {
            int mid = l + (h - l) / 2;

            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                h = mid;  // descending part
            } else {
                l = mid + 1; // ascending part
            }
        }
        return l; // peak index
    }
}
    
