import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		input.nextLine();
		System.out.println(Math.abs(num));
		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		input.nextLine();
		System.out.print("Input another number: ");
		double num2 = input.nextDouble();
		input.nextLine();
		System.out.println(Math.floor(num/num2));
		System.out.println(Math.ceil(num/num2));
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		input.nextLine();
		System.out.println(Math.round(Math.sqrt(num)));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		input.nextLine();
		System.out.print("Input another number: ");
		double num2 = input.nextDouble();
		input.nextLine();
		System.out.println(Math.pow(num,num2));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		input.nextLine();
		System.out.print("Input another number: ");
		double num2 = input.nextDouble();
		input.nextLine();
		System.out.print("Input one more number: ");
		double num3 = input.nextDouble();
		input.nextLine();
		System.out.println(Math.max(num, Math.max(num2, num3)));
		System.out.println(Math.min(num, Math.min(num2, num3)));
	}
	public static void q6() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String phrase = input.nextLine();
		System.out.println(phrase.contains("on"));
	}
	public static void q7() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String word = input.nextLine();
		System.out.println(word.equalsIgnoreCase("Mango"));
	}
	public static void q8() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = input.nextLine();
		System.out.print("Input a letter: ");
		String letter = input.nextLine();
		System.out.println(word.indexOf(letter));
		System.out.println(word.lastIndexOf(letter));
	}

	public static void q9() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String phrase = input.nextLine();
		System.out.println("Your sentence is " + phrase.length() + " characters long");
	}
	public static void q10() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String phrase = input.nextLine();
		System.out.print("Input a word to replace: ");
		String word = input.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String word2 = input.nextLine();
		System.out.println(phrase.replaceAll(word, word2));
	}

	public static void q11() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String phrase = (input.nextLine()).trim();
		System.out.println(phrase.toUpperCase());
		System.out.println(phrase.toLowerCase());
	}

	public static void q12() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = input.nextLine();
		System.out.println(word.substring(0,4));
		System.out.println(word.substring(word.length()-4));
	}
	

}
