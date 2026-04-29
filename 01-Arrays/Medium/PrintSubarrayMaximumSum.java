// print the subarray that has the maximum sum

import java.util.Scanner;

class Solution{
  public void indicesMaximumSubarray(int[] nums){
    long max = Long.MIN_VALUE;
    long sum = 0;
    int ansStart = -1;
    int ansEnd = -1;
    int start = 0;

    for (int i=0; i<nums.length; i++){
      if(sum == 0){
        start = i;
      }
      
      sum += nums[i];

      if(sum > max){
        max = sum;
        ansStart = start;
        ansEnd = i;
      }

      if(sum < 0){
        sum = 0;
      }
    }

    System.out.println("The maximum subarray sum is from index " + ansStart + " to " + ansEnd);
    System.out.print("The maximum subarray elements: [");
    for(int i=ansStart; i<=ansEnd; i++){
      System.out.print(nums[i] + ",");
    }
    System.out.println("]");
  }
}

public class PrintSubarrayMaximumSum {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in);) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
      } 

      Solution sol = new Solution();
      sol.indicesMaximumSubarray(arr);
    }
  }
}
