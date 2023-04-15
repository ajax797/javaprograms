package javaprograms;

public class panagram {

	public static void main(String[] args) 
	{
		String s="asdfghjklqwertyuiopzxcvbnm";
		boolean flag=true;
		for (char i = 'a'; i <= 'z'; i++) 
		{
			if(s.indexOf(i)==-1)
			{
				flag=false;
			}
			
		}
		if(flag)
		{
			System.out.println("panagram");
		}
		else
		{
			System.out.println("not panagram");
		}
	}

}
