class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        float s = a / b;
        ArrayList<Float> l = new ArrayList<>();
        l.add(s);
        l.add(Float.parseFloat(String.format("%.3f",s)));
        return l;
        
        
    }
}