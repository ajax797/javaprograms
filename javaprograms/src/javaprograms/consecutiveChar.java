package javaprograms;

public class consecutiveChar {

	public static void main(String[] args) 
	{
		String s="aabbbc111cccdddddabcccc";
//		String r=s.substring(0, 1);
//		for (int i = 0; i < s.length()-1; i++) 
//		{
//			if(s.charAt(i)==s.charAt(i+1))
//			{
//				r=r+s.charAt(i+1);
//			}
//			else
//			{
//				r=r+' '+s.charAt(i+1);
//			}
//		}	
//		//System.out.println(r);
//		String[] s1 = r.split(" ");
//		for (int i = 0; i < s1.length; i++) 
//		{
//			System.out.println(s1[i].charAt(0)+"---->"+s1[i].length());
//		}
		
		for (int i = 0; i < s.length(); i++) {
			int count=1;
			for (int j = i+1; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
					i++;
				}
					
				else
					break;
			}
			System.out.println(s.charAt(i)+"--->"+count);
		}
	}

}
