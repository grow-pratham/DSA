// Kadane's Algorithm : Maximum Subarray Sum in an Array

// Problem Statement: Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.

// A subarray is a contiguous non-empty sequence of elements within an array.

// Examples
// Example 1:
// Input:
//  nums = [2, 3, 5, -2, 7, -4]  
// Output:
//  15  
// Explanation:
//  The subarray from index 0 to index 4 has the largest sum = 15, which is the maximum sum of any contiguous subarray.

import java.util.Scanner;

class Solution{
  public long maximumSubarraySum(int[] nums){
    long max = Long.MIN_VALUE;
    long sum = 0;

    for (int i = 0; i<nums.length; i++){
      sum += nums[i];

      if(sum > max){
        max = sum;
      }

      if(sum < 0){
        sum = 0;
      }
    }
    return max;
  }

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

    System.out.print("The maximum subarray sum is from index " + ansStart + " to " + ansEnd);
    System.out.print("The maximum subarray elements: [");
    for(int i=ansStart; i<=ansEnd; i++){
      System.out.print(nums[i] + " ");
    }
    System.out.println("]");
  }
}

public class KadanesAlgorithm {
  public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in);) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
      } 

      Solution sol = new Solution();

      System.out.println("Maximum subarray sum: " + sol.maximumSubarraySum(arr));
      sol.indicesMaximumSubarray(arr);
    }
  }
}
