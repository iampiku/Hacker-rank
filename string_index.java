// this code seprates the even and odd index of n number of strings
import java.util.Scanner;
public class string_index{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            String str = scan.next();
            printEvensOdds(str);
        }
        scan.close();
    }
    public static void printEvensOdds(String str) {
        //Java StringBuffer class is used to create mutable (modifiable) string.
        StringBuffer evens = new StringBuffer(); 
        StringBuffer odds  = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i % 2 == 0) {
                evens.append(ch);// even + ch;
            } else {
                odds.append(ch); // odd + ch;
            }
        }
        System.out.println(evens + " " + odds);
    }
}
