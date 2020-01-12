import java.util.Scanner;
public class left_pattern{
    public static void main(String args[]){
        Scanner br = new Scanner(System.in);
        int n = br.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("# ");
            }
            System.out.println(); // This print statment move the out on to a new line
            br.close();
        }
    }
}