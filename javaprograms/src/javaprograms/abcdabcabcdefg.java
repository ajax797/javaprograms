package javaprograms;

import java.util.Arrays;

public class abcdabcabcdefg {

	public static void main(String[] args) 
	{
		String s="aabcdabcabcdefg";
		//op--- abcdefg     abcd    abc
		String[] s1 = s.split("a");
		Arrays.sort(s1);
		for (int i = s1.length-1; i >0; i--) 
		{
			System.out.println("a"+s1[i]);
		}
		
	}

}
