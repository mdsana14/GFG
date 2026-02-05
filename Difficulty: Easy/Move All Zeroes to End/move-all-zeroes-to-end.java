class Solution {
    void pushZerosToEnd(int[] arr) {
        int c = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[c++] = arr[i];
            } 
        }
        while(c < arr.length){
            arr[c++] = 0;
        }
        
    }
}