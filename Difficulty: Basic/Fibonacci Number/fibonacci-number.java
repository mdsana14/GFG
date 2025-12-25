class Solution {
    public static int fibonacci(int n) {
        int n1 = 0;
        int n2 = 1;
        int r= 0;
        for(int i=2;i<=n;i++){
            r = n1 + n2;
            n1 = n2;
            n2 = r;
        }
        return r;
    }
}
