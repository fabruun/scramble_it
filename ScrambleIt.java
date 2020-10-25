import java.util.Scanner;

class ScrambleIt {
	private static Scanner reader;
	private static final int EXIT = 0;
	private static final int VOWELS = 1;
	private static final int SPACES = 2;
	private static final int REVERSE = 3;
	private static final int BLOCKS = 4;
	private static final int SHIFT = 5;

	public static void main(String[] args) {
		init();
		int option;


		do {
			printMenu();
			option = reader.nextInt();
			switch(option) {
				case VOWELS:
					System.out.println(removeVowels());
					break;
				case SPACES:
					System.out.println(spaces());
					break;
				case REVERSE:
					System.out.println(reverse());
					break;
				case BLOCKS:
					System.out.println(blocks());
					break;
				case SHIFT:
					System.out.println(shift());
					break;
				case EXIT:
					System.out.println("Goodbye :-)");
					break;
				default:
					System.out.println("Input invalid. Please input a correct value.");
			}
		}while(option != EXIT);
	}

	/*
	 * Initializes the Scanner object reader
	 */
	private static void init() {
		reader = new Scanner(System.in);
	}

	/*
	 * Prints the menu for the client.
	 */
	private static void printMenu() {
		System.out.println("Please choose which function you want to call.");
		System.out.println("Press " + VOWELS + ": Removes all vowels from a text.");
		System.out.println("Press " + SPACES + ": Removes alls spaces from a text.");
		System.out.println("Press " + REVERSE + ": Reverses all words in a text");
		System.out.println("Press " + BLOCKS + ": Transforms a text to a given number of blocks.");
		System.out.println("Press" + SHIFT + ": Shift each word in the text with a given number of characters");
	}


	/*
	 * Removes all vowels from a word in a given text, expect for those words
	 * that only innclude vowels.  
	 */
	private static String removeVowels() {
		String text = "";
		String input;
		System.out.println("Please input a string: ");
		input = reader.nextLine();
		int i = 0;
		while(i < input.length()) {
			if(input.charAt(i) != 'a' && input.charAt(i) != 'e' && 
			   input.charAt(i) != 'i' && input.charAt(i) != 'o' &&
			   input.charAt(i) != 'u') {
				text = text + input.charAt(i); 
			}
			i = i + 1;
		}

		return text;
	}

	/*
	 * Removes all spaces from a text and adds a new space after every
	 * n'th character
	 * Parameters: String text and int m
	 */
	private static String spaces() {
		String text = "";
		String input;
		int n;
		System.out.println("Please input a string: ");
		reader.nextLine();
		input = reader.nextLine();
		System.out.println("Please input a number: ");
		n = reader.nextInt();
		int i = 0;
		while(i < input.length()) {
			if(input.charAt(i) != ' ') {
				text = text + input.charAt(i);
			}
			if(i % n == 1) {
				text = text + ' ';
			}
			i = i + 1;
		}	

		return text;
	}

	/*
	 * Reverses every individual word in the text
	 * Parameters: String text
	 */
	private static String reverse() {
		String text = "";
		String input;
		System.out.println("Please input a string: ");
		reader.nextLine();
		input = reader.nextLine();
		int i = input.length() - 1; 
		while(i >= 0) {
			text = text + input.charAt(i);
			i = i - 1;
		}

		return text;
	}

	/*
	 * Divide text into blocks of length m, if the length of each word is s
	 * smaller than m reverse it.
	 * Parameters: String text and int m
	 */
	private static String blocks() {
		return "blocks";
	}

	/*
	 * Shift each word in the text by a given number of characters
	 * Parameters: String text and int ,
	 */
	private static String shift() {
		return "shift";
	}
}
