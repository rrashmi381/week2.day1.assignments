package week2.day1.assignments;

public class CharOccurance {
	public static void main(String[] args) {
		String str="Hello World";
		int count=0;
		char[] strArr=str.toCharArray();
		char inp='o';
		for(int i=0;i<strArr.length-1;i++)
		{
			if(strArr [i]==inp)
{
	count++;
	
}
		}
		System.out.println("the char occurance is :  "+count);
	}

}
