
// User function template for C++
class Solution {
  public:
    // Function returns the second
    // largest elements
    int getSecondLargest(vector<int> &arr) {
        int largest = arr[0],secLargest= -1;
        for(int i=1;i<arr.size();i++)
        {
            if(arr[i] > largest)
            {
                secLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secLargest && arr[i] != largest)
            {
                secLargest = arr[i];
            }
        }
        return secLargest;
    }
};