package javaprograms;

public class reverseRecurssive2 {
	static int y=0;
	public static void main(String[] args) 
	{
		rev(145);
		System.out.println("aa");
	}
	
	public static void rev(int x)
	{
		if(x!=0)
		{
			int r=x%10;
			y=y*10+r;
			x=x/10;
			rev(x);
		}
		else
		System.out.println(y);
	}

}









