package javaprograms;

public class occuranceOfChar 
{
	public static void main(String[] args)
	{
		occuranceOfCharacter("Testyantra");
	}
	public static void occuranceOfCharacter(String str)
	{
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{ 
				if(arr[i]==arr[j])
				{
					if(j<i)
					{
						break;
					}
					count++;
				}
			}
			if(count>=1)
			{
				System.out.println(arr[i]+"--->"+count);
			}
		}
	}

}
