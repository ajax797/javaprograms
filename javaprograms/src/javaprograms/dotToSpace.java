package javaprograms;

public class dotToSpace {

	public static void main(String[] args) 
	{
		String s="update.delete.send";
		char[] s1 = s.toCharArray();
		for (int i = 0; i < s1.length; i++) 
		{
			if(s1[i]=='.')
			{
				s1[i]=' ';
			}
		}
		
		System.out.println(new String(s1)); 
//		for (int i = 0; i < s.length(); i++) 
//		{
//			if(s.charAt(i)=='.')
//			{
//				s.charAt(i)=' ';
//			}
//			
//		}
	}

}
