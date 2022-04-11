public class Print_All_Alphabets {

	public static void main(String[] args) {

		char character = 'A';
		System.out.print("Upper Case Alphabets \n");
		do {
			System.out.print(character + " ");
			character++;
		} while (character <= 'Z');

		System.out.print("\n\n");

		
		character = 'a';
		System.out.print("Lower Case Alphabets \n");
		do {
			System.out.print(character + " ");
			character++;
		} while (character <= 'z');
	}
}