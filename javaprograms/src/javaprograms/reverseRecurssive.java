package javaprograms;

public class reverseRecurssive {
	static String r="";
	static String s="selenium";
	static int i=s.length()-1;

	public static void main(String[] args) 
	{
		rev(i);
		System.out.println(r);
	}
	
	public static int rev(int x)
	{
		if(i>=0)
		{
			r=r+s.charAt(i);
			i--;
			rev(i);
		}
		return i;
		
	}

}









