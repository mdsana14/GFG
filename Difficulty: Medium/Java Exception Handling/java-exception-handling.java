// User function Template for Java

class Solution {
    public int findMin(int a, int b) {
        int r = Integer.MAX_VALUE;
        try{
            r = Math.min(r,a/ b);
        }
        catch(Exception e){
            r = Integer.MAX_VALUE;
        }
        finally{
            r = Math.min(a + b,r);
            r = Math.min(a - b,r);
            r = Math.min(a * b,r);
        }
        return r;
    }
}