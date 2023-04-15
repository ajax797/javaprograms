package javaprograms;

public class triangleNo4 {

	public static void main(String[] args) 
	{
		int row=6;
		
		for (int i = 1; i <= row; i++) 
		{
			int x=1;
			for (int j = 0; j < row-i; j++) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(x+" ");
				x=x*(i-j)/j;
			}
			System.out.println();
		}

	}

}
