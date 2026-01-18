class Solution {
    int missingNumber(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] != i+1){
               return i+1;
            }
        }
        return n + 1;
    }
}