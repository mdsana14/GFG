class Solution {
    public static int nSum(int n) {
        
        int ans = 0;
        while(n != 0){
            ans += n;
            n--;
        }
        return ans;
    }
}
