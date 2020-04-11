import java.util.Scanner;

public class reverse {

      public static void main(String args[]) {
            Scanner br = new Scanner(System.in);
            int a = br.nextInt();
            int arr[] = new int[a];
            for (int i = 0; i < a; i++) {
                  arr[i] = br.nextInt();
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                  System.out.print(arr[i] + " ");
            }
            br.close();
      }
}