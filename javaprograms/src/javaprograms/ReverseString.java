package javaprograms;

public class ReverseString {

	public static void main(String[] args) 
	{
		String str="testyantra";
		String rev="";
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			rev=arr[i]+rev;
		}
		System.out.println(rev);
	}

}
