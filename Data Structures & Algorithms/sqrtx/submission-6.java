class Solution {
    public int mySqrt(int x) {
      int l = 1;
      int h = x;
      if (x == 0) return 0;   // important
      while ( l <= h){
        int mid = l + (h -l) / 2;
        long sq = (long) mid * mid;  // fix
        if (sq == x){
            return mid;
        }
        else if ( sq < x){
            l = mid + 1;
        }
        else{
            h = mid - 1;
        }
      }
      return h;
    }
}