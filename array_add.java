import java.util.Scanner;
public class array_add{
    public static void main(String args[]){
        Scanner br = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter the range of the array");
        int a = br.nextInt();
        System.out.println("enter the elements of the array");
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i] = br.nextInt();
        }
        for(int i=0;i<a;i++){
            sum = sum+arr[i];
        }
       System.out.println(sum);
       br.close();
    }
}   