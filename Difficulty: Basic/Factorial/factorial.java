// User function Template for Java
class Solution {
    public static int nFactorial(int n) {
        int ans = 1;
        
        while(n > 1){
            ans *= n;
            n--;
        }

        return ans;
    }
}