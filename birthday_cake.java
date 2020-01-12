import java.util.Scanner;
class solution{
      Scanner br = new Scanner(System.in);

      static int n,max,c;
      static int arr [] =  new int [100];

      void get_data(){
            n = br.nextInt();
            for(int i=0; i<n; i++){
                arr[i] = br.nextInt();
            }
      }

      void largest_candle(){
            for(int i=0; i<n; i++){
                  if(arr[i] > max){
                        max = arr[i];
                  }
            }
            System.out.println("largest element of the array" +max);
      }

      void number_candle(){
            for(int i=0; i<n; i++){
                        if(arr[i] == max){
                              c++;
                        }
                  }
            System.out.println(c);
      }
}

public class birthday_cake{
      public static void main(String args[]){
          solution ob = new solution();
            ob.get_data();
            ob.largest_candle();
            ob.number_candle();
      }
}
