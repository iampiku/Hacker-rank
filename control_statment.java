import java.util.Scanner;

public class control_statment {
      public static void main(String arg[]) {
            Scanner br = new Scanner(System.in);
            int n = br.nextInt();
            if (n % 2 == 0) {
                  if (n >= 2 && n <= 5) {
                        System.out.println("Not Weird");
                  }
                  if (n >= 6 && n <= 20) {
                        System.out.println("Weird");
                  }
                  if (n > 20) {
                        System.out.println("Not Weird");
                  }
            } else {
                  System.out.println("Weird");
            }
            br.close();
      }
}