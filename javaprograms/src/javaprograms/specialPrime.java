package javaprograms;

public class specialPrime {

	public static void main(String[] args) 
	{
		String s="aeoeaeooooxxxx";
		char[] a = s.toCharArray();
		
		for (int i = 0; i < a.length; i++) 
		{
			int count=0;
			for (int j = 0; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					if(i>j)
					{
						break;
					}
					count++;
				}	
			}
			if(count>0&&prime(count))
			{
				System.out.println(a[i]);
			}
			
		}

	}
	public static boolean prime(int x)
	{
		int c=0;
		for (int i = 1; i <= x; i++) 
		{
			if(x%i==0)
			{
				c++;
			}
		}
		if(c==2)
			return false;
		else
			return true;
		
	}

}
