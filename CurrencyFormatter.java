import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    public static void main(String args[]) {
        Scanner br = new Scanner(System.in);
        double amount = br.nextDouble();
        br.close();

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("USA: " + us.format(amount));
        System.out.println("India: " + india.format(amount));
        System.out.println("China: " + china.format(amount));
        System.out.println("France: " + france.format(amount));
    }
    
}