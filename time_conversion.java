import java.io.*;

public class time_conversion {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String twelve_hr = br.readLine();
        String arr[] = twelve_hr.split(":");
        if (twelve_hr.contains("AM") && twelve_hr.contains("12")) {
            String sec = arr[2].replace("AM","");
            String result = "00"+":"+arr[1]+":"+sec;
            System.out.println(result);
        } else if (twelve_hr.contains("AM")) {
            String sec = arr[2].replace("AM","");
            String result = arr[0]+":"+arr[1]+":"+sec;
            System.out.println(result);
        }
        if(twelve_hr.contains("PM")) {
            String sec = arr[2].replace("PM","");
            if(arr[0].contains("12")){
                String result = arr[0]+":"+arr[1]+":"+sec;
                System.out.println(result);
            } else {
                int hours = Integer.parseInt(arr[0]) + 12;
                String result = String.valueOf(hours)+":"+arr[1]+":"+sec;
                System.out.println(result);
            }
        }
    }
}