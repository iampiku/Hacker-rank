import java.util.Scanner;
public class triplets{
    public static void main(String args[]){
        Scanner br = new Scanner(System.in);
        int a = 0,b = 0;
        int arr1[] = new int[3];
        int arr2[] = new int[3];
        System.out.println("enter the rating of alice's challenge");
        for(int i=0;i<3;i++){
            arr1[i] = br.nextInt();
        }
        System.out.println("enter the rating of bob's challenge");
        for(int j=0;j<3;j++){
            arr2[j] = br.nextInt();
        }
        for(int i=0;i<3;i++){
                if(arr1[i]>arr2[i]){
                    a=a+1;
                }
                if(arr1[i]<arr2[i]){
                    b=b+1;
                }  
            }
        System.out.print(a +" "+ b);
        br.close();
    }
}