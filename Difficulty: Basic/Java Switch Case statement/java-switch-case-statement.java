// User function Template for Java

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        double area = 0.0;
        switch(choice){
            case 1:
                double r = arr.get(0);
                area = Math.PI * r * r;
            break;
            case 2:
                double l = arr.get(0);
                double b = arr.get(1);
                area = l * b;
            break;
            default:
              System.out.println("Invalid");
            break;
            
        }
        return area;
    }
}