package interviewQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "Krishan";
		String s2 = "rishank";
		String s3="";
		
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

			System.out.println("\n***************For Check Palindrome *****************\n");
				for(int i=s1.length()-1;i>=0;i--){

					s3=s3+s1.charAt(i);

				}
					System.out.println(s3);

					if(s1.equals(s3)){
							System.out.println("String is palindrome");
					}else{
						System.out.println("String is Not palindrome");
					}

					String [] s1 = {"Balazs", "Vikrant", "Mohasin", "Ahmed" ,"Hanumaan","Jayshreeram"};
					
					List<String> stringLenght= Arrays.asList(s1);
					stringLenght.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}

}
