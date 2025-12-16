// User function Template for Java
class Solution {
    public static String compareNM(int n, int m) {
        String res = "";
        if(n < m){
            res = "lesser";
        }
        else if(n == m){
            res = "equal";
        }
        else{
            res = "greater";
        }
        return res;
    }
}