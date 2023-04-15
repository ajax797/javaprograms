package javaprograms;

public class anagram {

	public static void main(String[] args) 
	{
		String s1="asdfg";
		String s2="fgesa";
		if(s1.length()!=s2.length())
			System.out.println(s1+" & "+s2+" are not anagrams");
		else
		{
			char[] a1 = s1.toCharArray();
			char[] a2 = s2.toCharArray();
			for (int i = 0; i < a1.length-1; i++) 
			{
				for (int j = 0; j < a1.length-1; j++) 
				{
					if(a1[j]>a1[j+1])
					{
						char temp=a1[j];
						a1[j]=a1[j+1];
						a1[j+1]=temp;
					}
					if(a2[j]>a2[j+1])
					{
						char temp=a2[j];
						a2[j]=a2[j+1];
						a2[j+1]=temp;
					}	
				}	
			}
			if(new String(a1).equals(new String(a2)))
			{
				System.out.println(s1+" & "+s2+" are anagrams");
			}
			else
			{
				System.out.println("not anagram");
			}
		}

	}

}
