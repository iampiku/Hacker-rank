import java.io.*;
import java.time.LocalDate;

public class DateTime {

	public static String day(int year, int month, int day) {
		return LocalDate.of(year, month, day).getDayOfWeek().name();
	}
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the date in the following format : YYYY-MM-DD : ");
		String date[] = br.readLine().split("-");
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int day = Integer.parseInt(date[2]);
		String result = day(year, month, day);
		System.out.println(result);
	}
}