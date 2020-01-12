// program to understand basic fuctions of strings in java;
import java.util.Scanner;
class hacker_rank{
      Scanner br = new Scanner(System.in);
      
      String a;
      String b;

      void get_data(){
            a = br.nextLine();
            b = br.nextLine();
      }

      void letters(){
            System.out.println(a.length()+b.length());
      }

      void compare(){
            //a.compareTo(b) = fuction is used to compare two different Strings a & b lexicographically (position in the dictionary); 
            if(a.compareTo(b) > 0){
                  System.out.println("Yes");
            }else{
                  System.out.println("No");
            }
      }

      void capital(){
            //.substring(starting index ,ending index) = this fuction will return String from the starting index to endindex-1;
            
            //.substring(starting index) =  this fuction will return String from the mentioned index to the end of the string;
            String new_1 = a.substring(0,1).toUpperCase()+a.substring(1);
            String new_2 = b.substring(0,1).toUpperCase()+b.substring(1);
            System.out.println(new_1 +" "+new_2);
      }

}
public class basic{
      public static void main(String args[]){
            hacker_rank ob = new hacker_rank();
            ob.get_data();
            ob.letters();
            ob.compare();
            ob.capital();
      }
}