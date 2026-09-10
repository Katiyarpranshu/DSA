1class Solution {
2    public int numOfSubarrays(int[] arr, int k, int threshold) {
3
4        int sum = 0;
5        int maxT = k*threshold;
6
7        for( int i = 0; i < k; i =i+1) {
8            sum = sum+ arr[i];
9        }
10        int count = 0;
11
12        if(sum>= maxT) {
13            count +=1;
14        }
15        for (int i =k; i<arr.length; i++) {
16            sum = sum + arr[i];
17            sum = sum - arr[i-k];
18            if(sum >= maxT) {
19                count++;
20            }
21        }
22        return count; 
23    }
24}