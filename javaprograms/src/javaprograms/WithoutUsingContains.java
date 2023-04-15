package javaprograms;

public class WithoutUsingContains {

	public static void main(String[] args) {
		String s1="java is a progrprogrqammammaing language";
		String[] a1 = s1.split("");
		String s2="program";
		String[] a2 = s2.split("");
		boolean flag=true;
		for (int i = 0; i < a1.length; i++) 
		{
			if(a1[i].equals("p"))
			{
				int x=i;
				int count=0;
				for (int j = 0; j < a2.length; j++) 
				{
					if(a1[x].equals(a2[j]))
					{
						count++;
						x++;	
					}
					
				}
				if(count==a2.length)
				{
					System.out.println("yes");
					flag=false;
				}
				
			}
			
		}
		if(flag)
		{
			System.out.println("No");
		}

	}

}
