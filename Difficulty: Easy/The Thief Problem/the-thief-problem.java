class Solution {
    public int getMaxVal(List<Integer> arr, int k) {
        Collections.sort(arr);
        int t = 0;
        for(int i=arr.size()-k;i<arr.size();i++){
            t += arr.get(i);
        }
        return t;
        
    }
}