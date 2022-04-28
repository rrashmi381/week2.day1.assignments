package week2.day1.assignments;

public class FindTypes {
	public static void main(String[] args) {
		String test= "$$ Welcome to testing leaf $$";
		int letter=0,space=0,num=0,specialChar=0;
		char[]testArr=test.toCharArray();
		for(int i=0;i<testArr.length-1;i++)
		{
			if(Character.isLetter(testArr[i]))
			{
				letter++;
			}
			else if (Character.isDigit(testArr[i]))
			{
				num++;
			}
			else if(Character.isSpaceChar(testArr[i]))
			{
				space++;
			}
			else
			{
				specialChar++;
			}
		}
		System.out.println("letter: "+ letter);
		System.out.println("space: "+ space);
		System.out.println("number: "+ num);
		System.out.println("specialCharacter: "+ specialChar);
	}
	}
