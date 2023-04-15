package javaprograms;

public class Aa_print {

	public static void main(String[] args) 
	{
		String s = "abcdepggdABnvCJLPP";
		 //op--ABCP==== P
		String r = "";
		char l = 'A';
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch)) 
			{
				if (s.indexOf(Character.toLowerCase(ch)) != -1) 
				{
					if (r.indexOf(ch) == -1) 
					{
						r = r + ch;
						if (ch > l) 
						{
							l = ch;
						}
					}
				}
			}
		}
		System.out.println(r);
		System.out.println(l);
		
//		
//		String s = "abcdepgygdABnvCJLPAPY";
//		String r="";
//		String[] s1 = s.split("");
//		char l='A';
//		for (int i = 0; i < s1.length; i++) 
//		{
//			for (int j = i+1; j < s1.length; j++) 
//			{
//				if(s1[i].toUpperCase().equals(s1[j]))
//				{
//					if(!r.contains(s1[j]))
//					{
//						r=r+s1[j];
//						char x=s1[j].toCharArray()[0];
//						if(x>l)
//						{
//							l=x;
//						}
//					}
//				}
//			}
//		}
//		System.out.println(r);
//		System.out.println(l);
	}
}

