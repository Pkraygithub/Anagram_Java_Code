package interviewQuestion;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "Krishan";
		String s2 = "rishank";

		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {
			System.out.println("it's Anagram");
		} else {
			System.out.println("it's not Anagram");
		}

	}

}
