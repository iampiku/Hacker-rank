import java.io.*;
public class even_odd_index{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        String str1 = "";
        String str2 = "";
        System.out.println("enter the number of strings");
        int n = Integer.parseInt(br.readLine());
        System.out.println("enter your strings");
        for(int i=1;i<=n;i++){
            str = br.readLine();
        }
        for(int j=0;j<str.length();j++){
            char ch = str.charAt(j);
            if(j%2==0)
                str1 = str1 + ch;
            
            else
                str2 = str2 + ch;
            
        }
        System.out.println(str1+" "+str2);
    }
}