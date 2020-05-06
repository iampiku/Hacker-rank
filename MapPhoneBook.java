import java.io.*;
import java.util.Map;
import java.util.HashMap;

public class MapPhoneBook {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Map<String, Long> phonebook = new HashMap<String, Long>();
        for (int i = 0; i < num; i++) {
            String name = br.readLine();
            Long number = Long.parseLong(br.readLine());
            phonebook.put(name, number);
        }
        for (int j = 0; j < num; j++) { 
            String user = br.readLine().trim();
            if (phonebook.containsKey(user)) {
                Long result = phonebook.get(user);
                System.out.println(user + "=" + result);
            } else {
                System.out.println("Not Found");
            }
        }
    }
} 