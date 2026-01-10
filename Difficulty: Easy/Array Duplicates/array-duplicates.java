class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> r = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                r.add(arr[i]);
            }
        }
        return r;
    }
}