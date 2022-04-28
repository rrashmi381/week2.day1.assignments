package week2.day1.assignments;

public class Palindrome {
	public static void main(String[] args) {
		
		String text="hello";
		String rev="";
		for(int i=text.length()-1;i>=0;i--)
		{
			rev=rev+text.charAt(i);
		}
		if(text.equalsIgnoreCase(rev))
		{
			System.out.println(text + "The given string is Palindrome");
		}
		else
		{
			System.out.println(text + "The given string is not palindrome");
		}
	}
}
