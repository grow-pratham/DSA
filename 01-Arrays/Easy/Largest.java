// Problem Statement: Given an array, we have to find the largest element in the array.

import java.util.Scanner;

class Largest{

  public static int largestElement(int[] arr, int n){
    int largest = arr[0];
    for (int i = 0; i < n ; i++) {
      if(arr[i] > largest) {
        largest = arr[i];
      }
    }
    return largest;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in);) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
      } 

      System.out.println("Largest Element: " + largestElement(arr, n));
    }
  }
}