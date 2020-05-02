import java.util.Scanner;

public class EndFile {
    public static void main(String args[]) {
        Scanner br = new Scanner(System.in);
        int i = 0;
        while(br.hasNext()) {
        	String str = br.nextLine();
        	i++;
        	System.out.println(i + " " + str);
        }
        br.close();
    }    
}