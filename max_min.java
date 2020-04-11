// this code will return the lagest and the smallest element of the array
// this code will also solve the problem of max and min sum of the elements of the array from hacker rank;
import java.util.Scanner;
class program{
      Scanner br = new Scanner(System.in);

      int n,max,min; int sum_max,sum_min;            
      int arr[] = new int [100];

      void get_data(){
            System.out.println("enter the range of the array");
            n = br.nextInt();
            System.out.println("enter the elements of the array");
            for(int i=0; i<n; i++ ){
                  arr[i] = br.nextInt();
            }
      }

      void largest_number(){
            for(int i=0; i<n; i++ ){
                  if(arr[i] > max){
                        max = arr[i];
                  }
            }
            System.out.println("Largest number" +max);
      }

      void smallest_number(){
            for(int i=0; i<n; i++ ){
                  for(int j=0; j<n-i-1; j++){
                        if(arr[j] > arr[j+1]){
                              int temp = arr[j];
                              arr[j] = arr[j+1];
                              arr[j+1] = temp;
                        }
                  }
            }
            System.out.println("Smallest number" +arr[0]);
      }

      void max_sum(){
            for(int i=0; i<n; i++){
                  sum_max = sum_max+arr[i];
            }
            System.out.println(sum_max-min);
      }

      void min_sum(){
            for(int i=0; i<n; i++){
                  sum_min = sum_min + arr[i];
            }
            System.out.println(sum_min-max);
      }
}
public class max_min{
      public static void main(String args[]){
            program ob = new program();
            ob.get_data();
            ob.largest_number();
            ob.smallest_number();
            ob.min_sum();
            ob.max_sum();
      }
}