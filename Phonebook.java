import java.io.*;
import java.util.HashMap;

public class Phonebook {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        long num;
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Long> m = new HashMap<String, Long>();
        for (int i = 0; i < n; i++) {
            m.put(name = br.readLine(), num = Long.parseLong(br.readLine()));
        }
        for (int i = 0; i < n; i++) {
            String a = br.readLine();
            if (m.containsKey(a)) {
                System.out.println(a + "=" + m.get(a));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
