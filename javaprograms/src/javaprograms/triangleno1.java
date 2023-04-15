package javaprograms;

public class triangleno1 {

	public static void main(String[] args) {

		int row = 3;

		int space = row-1;
		int star = 1;
		
		for (int i = 1; i <= row; i++) 
		{
			int x=i;
			for (int j = 0; j < space; j++) 
			{
				System.out.print("  ");

			}
			for (int j = 0; j < star; j++) 
			{
				System.out.print(x+" ");
				if(j<star/2)
				{
					x--;
				}
				else
				{
					x++;
				}
				
			}
			
			space--;
			star=star+2;
			System.out.println();
		}

	}

}
