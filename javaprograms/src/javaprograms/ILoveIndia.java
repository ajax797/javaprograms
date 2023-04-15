package javaprograms;

public class ILoveIndia {

	public static void main(String[] args) 
	{
		String s="I Love India";
		String s1 = s.replaceAll(" ", "");
		String res="";
		char[] s3 = s1.toCharArray();
		int j=s3.length-1;
		for (int i =0 ; i <s.length(); i++)
		{
			if(s.charAt(i)==' ')
			{
				res=res+' ';
			}
			else
			{
				res=res+s3[j];
				j--;
			}
			
		}
		System.out.println(res);
				
	}

}
