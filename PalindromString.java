import java.util.Scanner;

public class PalindromString {
	public static void check(String userInput) {
		String reverseString = "";
		for (int i = userInput.length() - 1; i >= 0; i--) {
			reverseString += userInput.charAt(i);
		}
		if (userInput.equals(reverseString)) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
	}
	public static void main(String args[]) {
		Scanner br = new Scanner(System.in);
		String userInput = br.next();
		PalindromString.check(userInput);
		br.close();
	}
}