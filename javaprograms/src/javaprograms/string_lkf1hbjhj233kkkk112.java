package javaprograms;

public class string_lkf1hbjhj233kkkk112 {

	public static void main(String[] args) {
		String s = "k5to1 ch20eck if5 its i10nstaled";
		char[] s1 = s.toCharArray();
		int c = 0;
		String r = "";
		for (int i = 0; i < s1.length-1; i++) 
		{
			if(s1[i]>='0'&&s1[i]<'9')
			{
				if(i==c+1)
				{
					r=r+s1[i];
				}
				else
				{
					r=r+" "+s1[i];
				}
				c=i;
			}	
		}
		System.out.println(r);
		String[] s2 = s.replaceAll("[^0-9]", "a").split("a");
		int mul = 1;
		for (int i = 0; i < s2.length; i++) {
			if (s2[i] != "") {
				mul *= Integer.parseInt(s2[i]);
			}

		}
		System.out.println(mul);
	}

}
