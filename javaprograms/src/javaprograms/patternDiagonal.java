package javaprograms;

public class patternDiagonal {

	public static void main(String[] args) 
	{
		int x=9;
		for (int i = 1; i <= x; i++) 
		{
			for (int j = 1; j <= x; j++) 
			{
				
					if(j==1||j==x||j==i||i+j==x+1||i==1||i==x)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				
				
			}
			System.out.println();
		}
	}

}
