import java.util.Scanner;
public class plus_minus{
    public static void main(String args[]){
        Scanner br = new Scanner(System.in);
        double neg=0,pos=0,zero=0;
        double negative,positive,zeero;
        int n = br.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = br.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){ 
                neg++;
            }
            if(arr[i]>0){
                pos++;
            }
            if(arr[i]==0){
                zero++;
            }
        }
        negative = neg/n;
        positive = pos/n;
        zeero = zero/n;
        System.out.println(negative);
        System.out.println(positive);
        System.out.println(zeero);
        br.close();
    }
}