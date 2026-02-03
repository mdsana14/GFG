// User function Template for Java
class Solution {
    public static String concatenateStrings(ArrayList<String> arr) {
        StringBuilder r = new StringBuilder();
        for(int i=0;i<arr.size();i++){
            r.append(arr.get(i));
        }
        return r.toString();
    }
}