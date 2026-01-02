class Solution {
    public int binarysearch(int[] arr, int k) {
        int l = 0,r = arr.length - 1;
        int a = -1;
        while(l <= r){
            int m = l + ( r - l) / 2;
            if(arr[m] == k){
                a = m;
                r = m-1;
            }
            else if(arr[m] < k){
                l = m + 1;
            }
            else{
                r = m  - 1;
            }
        }
        return a;
        
    }
}