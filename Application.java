import java.util.Stack;
import java.util.Scanner;
public class Application {
	
	public static void main(String[] args) {
		Stack<Character> charStack = new Stack<Character>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word to check if it is a palindrome.");
		String word = scan.nextLine();

		for (int i=0; i< word.length(); i++) {
			charStack.push(word.charAt(i));
		}
		
		String originalWord = charStack.toString();
		
		Stack<Character> reverseStack = new Stack<Character>();
		for (int i=0; i< word.length(); i++) {
			reverseStack.push(charStack.pop());
		}
		
		String reversedWord = reverseStack.toString();
		
		if (originalWord.equals(reversedWord)) {
			System.out.println(word + " is a palindrome.");
		}
		else {
			System.out.println(word + " is not a palindrome.");
		}
		scan.close();
	}
}