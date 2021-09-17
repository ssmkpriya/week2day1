package week2.day1;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Here is the input
		String text = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each
		// Convert the String to character array
		char[] chartext = text.toCharArray();
		// Traverse through each character (using loop)
		for (int i = 0; i < chartext.length; i++)
		// Find if the given character is what type using (if)
		// i) Character.isLetter
//						ii) Character.isDigit
//						iii)Character.isSpaceChar
//						iv) else -> consider as special character
		{
			if (Character.isLetter(chartext[i])) {

				letter++;
				char letters=chartext[i];
			
			} 
			
			else if (Character.isDigit(chartext[i])) {

				num++;

			} else if (Character.isSpaceChar(chartext[i])) {
				space++;

			} else {

				specialChar++;
			}
			
			
		}
		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);


	}

}
