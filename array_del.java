
// this program will remove the duplicate elements of the array;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class duplicate_element {
    Scanner br = new Scanner(System.in);

    static int n; // range of the array;
    static int arr[] = new int[100]; // initializetion of the array;

    void get_data() {
        System.out.println("enter the range of the array");
        n = br.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = br.nextInt();
        }
    }

    // we are using loop for detecting the duplicate number in the array;
    void method_1() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("repeated element in the array" + " " + arr[j]);
                }
            }
        }
    }

    // we are using hashSet to delete duplicate elements of the array as hashSet has
    // a property that it will not allow repeated element to enter into the set thus
    // avoiding duplication;
    void methos_2() {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        System.out.println("array without the duplicate elements" + " " + set);
    }
}

// main driver class
public class array_del {
    public static void main(String args[]) {
        duplicate_element ob = new duplicate_element();
        ob.get_data();
        ob.method_1();
        ob.methos_2();
    }
}