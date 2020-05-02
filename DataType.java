import java.util.Scanner;

public class DataType {
    public static void main(String args[]) {
        Scanner br = new Scanner(System.in);
        int num = br.nextInt();
        for (int i = 0; i < num; i++) {
            try {
                long data = br.nextLong();
                System.out.println(data + " can be fitted in:");
                if (data >= -128 && data <= 128 - 1) {
                    System.out.println("* byte");
                }
                if (data >= -Math.pow(2, 15) && data <= Math.pow(2, 15) - 1) {
                    System.out.println("* short");
                }
                if (data >= -Math.pow(2, 31) && data <= (Math.pow(2, 31) - 1)) {
                    System.out.println("* int");
                }
                if (data >= -Math.pow(2, 64) && data <= (Math.pow(2, 64) - 1)) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(br.nextLine() + " can't be fitted anywhere.");
            }
        }
        br.close();
    }
}