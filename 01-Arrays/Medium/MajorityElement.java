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
