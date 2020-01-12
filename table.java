import java.util.Scanner;

public class table {
      public static void main(String args[]) {
            Scanner br = new Scanner(System.in);
            int n = br.nextInt();
            for (int i = 1; i <= 10; i++) {
                  System.out.println(n + " x " + i + " = " + n * i);
            }
            br.close();
      }
}