import java.util.Scanner;

public class StaticInitializer {

	static boolean flag = true;
	static int B, H;

	static {
		Scanner br = new Scanner(System.in);
		B = br.nextInt();
		H = br.nextInt();
		if (B <= 0 || H <= 0) {
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		br.close();
	}

	public static void main(String args[]) {
		if (flag) {
			int area = B * H;
			System.out.println(area);
		}
	}
}