package week2.day1.assignments;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String Data_Str="hello world";
		String[] Data_Fn=Data_Str.split(" ");
		for(int i=0;i<Data_Fn.length;i++)
		{
			if(i%2!=0)
			{
				char[] chrArray=Data_Fn[i].toCharArray();
				String rev="";
				for(int j=(chrArray.length-1);j>=0;j--)
				{
					rev=rev+chrArray[j];
				}
				Data_Fn[i]=rev;
				System.out.println(Data_Fn[i]+" ");
			}
			else
			{
				System.out.println(Data_Fn[i]+" ");
			}
		}
	}

}
