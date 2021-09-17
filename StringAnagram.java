package week2.day1;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare the String
		String text1="stops";
		String text2="potss";
		//Find the Length
		int textlen=text1.length();
		int text2len=text2.length();
		
		//compare the length of text
		if(textlen==text2len)
		{
			//Convert both Strings in to characters
			
			char[] arrtext=text1.toCharArray();
			char[] arrtext2=text2.toCharArray();
			//sort the arrays
			Arrays.sort(arrtext);
			Arrays.sort(arrtext2);
			//compare the array
			if(Arrays.equals(arrtext,arrtext2))
			{
			System.out.println("Given Text is anagram");	
				
				
			}else
			{
				System.out.println("Given Text is not anagram");
				
				
			}
		}else {
			
			System.out.println("Length not equal");
			
		}

	}

}
