import java.util.Scanner;

class solution {
      Scanner br = new Scanner(System.in);

      int n = br.nextInt();
      int arr[] = new int[n];

      public void get_data() {
            for (int i = 0; i < n; i++) {
                  arr[i] = br.nextInt();
            }
      }

      public void unique() {
            for (int i = 0; i < n; i++) {
                  int counter = 0;
                  for (int j = 0; j < n; j++) {
                        if (arr[i] == arr[j] && i != j) {
                              counter++;
                        }
                  }
                  if (counter == 0) {
                        System.out.println(arr[i]);
                  }
            }
      }
}

public class Lonely {
      public static void main(String args[]) {
            solution ob = new solution();
            ob.get_data();
            ob.unique();
      }
}