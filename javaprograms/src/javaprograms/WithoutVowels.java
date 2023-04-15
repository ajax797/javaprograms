package javaprograms;

public class WithoutVowels {

	public static void main(String[] args) 
	{
		String str="testyantra";
		String s="";
		String[] arr = str.split("");
		for(int i=0;i<arr.length;i++)
		{
			if(!"aeiou".contains(arr[i]))
			{
				s=s+arr[i];
			}
		}
		System.out.println(s);	
	}
}
