// Problem Statement: Given an integer array nums of size n, return the majority element of the array.

// The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.

// Examples
// Example 1:
// Input:
//  nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]  
// Output:
//  7  
// Explanation:
//  The number 7 appears 5 times in the 9-sized array, making it the most frequent element.

// Example 2:
// Input:
//  nums = [1, 1, 1, 2, 1, 2]  
// Output:
//  1  
// Explanation:
//  The number 1 appears 4 times in the 6-sized array, making it the most frequent element.

import java.util.*;

class Solution{
  public int majorityElementOccured(int[] nums){
    int n = nums.length;
    int expectedElement = 0;
    int count = 0;

    for (int i=0;i<n;i++){
      if(count == 0){
        expectedElement = nums[i];
        count = 1;
      } else if (nums[i] == expectedElement){
        count++;
      } else {
        count --;
      }
    }

    int actualElementCount = 0;
    for (int i = 0; i < n; i++) {
        if(nums[i] == expectedElement){
          actualElementCount++;
        }
    }

    if(actualElementCount > n/2){
      return expectedElement;
    }
    return -1;
  }
}

public class MajorityElement {
  
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in);) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
      } 

      Solution sol = new Solution();

      System.out.println("Majority element: " + sol.majorityElementOccured(arr));
    }
  }
}
