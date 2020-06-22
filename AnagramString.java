import java.io.*;
import java.util.Arrays;

public class AnagramString {
	public static void anagramCheck(String word, String sample) {
		if (word.length() == sample.length()) {
			char a [] = word.toCharArray(); Arrays.sort(a);
			char b [] = sample.toCharArray(); Arrays.sort(b);
			if (Arrays.toString(a).equals((Arrays.toString(b)))) {
				System.out.print("Anagrams");
			} else {
				System.out.print("Not Anagrams");
			}
		} else {
			System.out.print("Not Anagrams");
		}
	}
	public static void main (String args []) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		String word = br.readLine();
		String sample = br.readLine();
		AnagramString.anagramCheck(word.toLowerCase(), sample.toLowerCase());
	}
}