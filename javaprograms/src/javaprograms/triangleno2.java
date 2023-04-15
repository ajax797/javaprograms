package javaprograms;

public class triangleno2 {

	public static void main(String[] args) 
	{
		int row=4;
		int space=row;
		int star=1;
		for (int i = 1; i <= row; i++) 
		{
			int x=1;
			for (int j = 1; j < space; j++) 
			{
				System.out.print("  ");
			}
			for (int j = 0; j < star; j++) 
			{
				System.out.print(x+" ");
				if(j<star/2)
				{
					x++;
				}
				else
				{
					x--;
				}
			}
			star=star+2;
			space--;
			System.out.println();
		}

	}

}
