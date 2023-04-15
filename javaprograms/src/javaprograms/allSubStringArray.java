package javaprograms;

public class allSubStringArray {
	public static void main(String[] args) {
		String[] s = { "abcxyd", "abxy", "abcbxy" };
		String r = "";
		// op---- ab

		for (int j = 0; j < s[0].length(); j++) 
		{

			for (int i = 0, c = 0; i < s.length - 1; i++)
			{
				if (j < s[i + 1].length())
				{
					if (s[i].charAt(j) == s[i + 1].charAt(j))
					{
						c++;
						if (c == s.length - 1)
						{
							r = r + s[i].charAt(j);
						}
					}

				} 
				else
				{
					break;
				}
			}
		}
		System.out.println(r);
	}
}
