package week2.day1;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String value="madam";
String reverse="";
for(int i=value.length()-1;i>=0;i--) 
	
{
	reverse=reverse+value.charAt(i);
	
}

System.out.println("The reversed string is"+""+ reverse);
if(reverse.equalsIgnoreCase(value))
{
System.out.println("It is Palindrome");	

}else
{
System.out.println("Not Palindrome");	

}
	

	}

}
