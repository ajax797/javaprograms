package javaprograms;

public class fact3digitNo {

	public static void main(String[] args) 
	{
		double no=120;
		int i=2;
		while(no>1)
		{
			no=no/i;
			i++;
		}
		if(no==1)
		{
			System.out.println("p ---"+(i-1));
		}
	}

}
