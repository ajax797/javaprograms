package javaprograms;

public class printMissingEvenNo {

	public static void main(String[] args) 
	{
		int[] a= {2,4,6,12,16,20};
		for (int i = 1; i <= a[a.length-1]; i++) 
		{
			boolean flag = true;
			if(i%2==0)
			{
				for (int j = 0; j < a.length; j++) 
				{
					if(i==a[j])
					{
						flag=false;
					}
				}
				if(flag)
				System.out.println(i);
			}
		}

	}

}
