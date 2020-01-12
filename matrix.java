import java.util.Scanner;
public class matrix{ // extracting the diagonal elements of a matrixes
    public static void main(String args[]){
        Scanner br = new Scanner(System.in);
        int sum1 = 0,sum2 = 0;
        System.out.println("enter the no of rows & colums");
        int n = br.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("enter the elements of the matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = br.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){ // these are the primary diagonal elements of the matrix the logic is that the index number of both i & j are the same
                    sum1 = sum1+arr[i][j];
                }
                if((i-j)==(n-1)){ //these are the secondary diagonal elements of the matrix the logic is the sum of the index of i & j is always 1 less then the no of rows and colums
                    sum2 = sum2+arr[i][j];
                }
            }
        }
        System.out.println(Math.abs(sum1-sum2));
        br.close();
    }
}