// Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array..

// Examples
// Example 1:
// Input: prices = {1, 1, 0, 1, 1, 1}
// Output: 3
// Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

// Example 2:
// Input: prices = {1, 0, 1, 1, 0, 1} 
// Output: 2
// Explanation: There are two consecutive 1's in the array.

import java.util.Scanner;

class Solution{
  public int countMaximumConsecutiveOnes(int[] arr){
    int count = 0;
    int maxCount = 0;
    
    for (int i=0;i<arr.length;i++){
      if(arr[i] == 1) {
        count++;
        continue;
      }
      if(count > maxCount){
        maxCount = count;
        count = 0;
      } else {
        count = 0;
      }
    }

    return count;
  }
}

public class maximumConsecutiveOnes {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in);) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
      } 
      Solution sol = new Solution();
      System.out.println("Maximum count of ones: " + sol.countMaximumConsecutiveOnes(arr));
    }
  }
}
