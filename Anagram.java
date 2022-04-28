package week2.day1.assignments;

import java.util.Arrays;

public class Anagram {
 public static void main(String[] args) {
	String text1="stops";
	String text2="potss";
	int len1,len2;
	boolean flag;
	len1=text1.length();
	len2=text2.length();
	if(len1==len2)
	{
		char[] tex1=text1.toCharArray();
		char[] tex2= text2.toCharArray();
		Arrays.sort(tex1);;
		Arrays.sort(tex2);;
		for(int i=0;i<len1;i++)
		{
			if(tex1[i]==tex2[i])
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
				
			}
				
		}
		if(flag=true)
		{
			System.out.println("The text is an Angram");
		}
		else
		{
			System.out.println("The text is not Angram");
		}
	}
}
}
