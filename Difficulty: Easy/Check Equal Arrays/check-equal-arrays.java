class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        boolean r = true;
        for(int i=0;i<a.length;i++){
            if(a[i] != b[i]){
              r = false;
              break;
            }
        }
        return r;
        
    }
}