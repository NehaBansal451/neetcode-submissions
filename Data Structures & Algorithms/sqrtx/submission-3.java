class Solution {
    public int mySqrt(int x) {
         if (x == 0) return 0;   // important
      return sqrt(x); }
    static int sqrt(double n){
      double x = n;
      double root;
      while(true){
           root = 0.5 * (x + (n /x));
        if(Math.abs(root -x) < 0.00001 ){
            break;
        }
        x = root;
      }
      return (int)root;
    }

}