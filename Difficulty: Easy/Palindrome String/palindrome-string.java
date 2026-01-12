class Solution {
    boolean isPalindrome(String s) {
        StringBuilder r = new StringBuilder(s);
        r.reverse();
        if(s.equals(r.toString())){
            return true;
        }
        else{
         return false;
        }
        
    }
}