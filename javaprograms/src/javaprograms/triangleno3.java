package javaprograms;

public class triangleno3 {

	public static void main(String[] args) 
	{
		int row=4;
		int star=1;
		for (int i = 1; i <= row; i++) 
		{
			int x=i;
			int y=row-1;
			for (int j = 0; j < star; j++) 
			{
				System.out.print(x+" ");
				x=x+y;
				y--;
			}
			star++;
			System.out.println();
		}

	}

}
