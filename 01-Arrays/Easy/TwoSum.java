import java.util.Scanner;
import java.util.Arrays;

class Solution{
  public String isTwoSumExists(int[] arr, int target){
    int n = arr.length;
    int left = 0;
    int right = n - 1;

    int[][] numsWithIndexes = new int[n][2];

    for(int i = 0; i<n; i++) {
      numsWithIndexes[i][0] = arr[i];
      numsWithIndexes[i][1] = i;
    }

    Arrays.sort(numsWithIndexes, (a, b) -> Integer.compare(a[0], b[0]));

    while(left < right) {
      if( numsWithIndexes[left][0] + numsWithIndexes[right][0] == target){
        return "YES";
      } else if ( numsWithIndexes[left][0] + numsWithIndexes[right][0] < target) {
        left++;
      } else {
        right--;
      }
    }
    return "NO";
  }

  public int[] indexWhereTwoSumExists(int[] arr, int target){
    int n = arr.length;
    int left = 0;
    int right = n - 1;

    int[][] numsWithIndexes = new int[n][2];

    for(int i = 0; i<n; i++) {
      numsWithIndexes[i][0] = arr[i];
      numsWithIndexes[i][1] = i;
    }

    Arrays.sort(numsWithIndexes, (a, b) -> Integer.compare(a[0], b[0]));

    while(left < right) {
      if( numsWithIndexes[left][0] + numsWithIndexes[right][0] == target){
        return new int[] {numsWithIndexes[left][1], numsWithIndexes[right][1]};
      } else if ( numsWithIndexes[left][0] + numsWithIndexes[right][0] < target) {
        left++;
      } else {
        right--;
      }
    }
    return new int[] {-1,-1};
  }
}

public class TwoSum {

  public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in);) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
      } 

      int target = sc.nextInt();

      Solution sol = new Solution();

      System.out.println(sol.isTwoSumExists(arr,target));

      int[] res = sol.indexWhereTwoSumExists(arr, target);
      System.out.println(res[0] + "," + res[1]);

      //Brute force/my approach
      // for(int i=0;i<n;i++){
      //   int key = target - arr[i];
      //   for(int j=i;j<n;j++){
      //     if(arr[j] == key){
      //       System.out.println("YES");
      //       System.out.println("[" + i + ", " + j + "]");
      //       break;
      //     }
      //   }
    
    }

  }
}

