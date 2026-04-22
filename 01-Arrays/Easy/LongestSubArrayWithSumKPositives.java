// // Problem Statement: Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.
// Input:
//  nums = [10, 5, 2, 7, 1, 9], k = 15  
// Output:
//  4  
// Explanation:
//  The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4. This sub-array starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore, the length of this sub-array is 4.

import java.util.Scanner;

class Solution{
  public int longestSubArrayWithSumK(int[] arr, int k){
    int n = arr.length;
    int maxLen = 0;
    int right = 0, left = 0;
    long sum = arr[0];
  

    while(right < n){
      while(left <= right && sum > k){
        sum -= arr[left];
        left++;
      }
      if(sum == k){
        maxLen = Integer.max(maxLen, right - left + 1);
      }
      right++;
      if(right < n){
        sum += arr[right];
      }
    }

    return maxLen;
  }
}

public class LongestSubArrayWithSumKPositives {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in);) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
      }

      int k = sc.nextInt(); 

      Solution sol = new Solution();
      System.out.println("Longest sub array length: " + sol.longestSubArrayWithSumK(arr, k));
    }
  }
}
