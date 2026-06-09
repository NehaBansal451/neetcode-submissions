class Solution {
    public boolean isPalindrome(String s) {
       
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        if(s.length() == 1){
            return true;
        }else{
         for(int i = 0; i < s.length() ; i++){
            char start = s.charAt(i);
            char end = s.charAt(s.length() - i -1);
            if(start != end){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
        }
    }
}
