import java.util.Scanner;

public class MoveZeros {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in);) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
      } 

      int[] result = new int[n];
      int index = 0;
      for (int i = 0; i<n; i++){
        if(arr[i] == 0){
          continue;
        } else {
          result[index] = arr[i];
          index++;
        }
      }

      for(int r : result) {
        System.out.print(r + " ");
      }

    }
  }
}
