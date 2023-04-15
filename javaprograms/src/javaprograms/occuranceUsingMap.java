package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeSet;

public class occuranceUsingMap {
	public static void main(String[] args) {
		String s1="my name is prakash";
		String[] s = s1.split(" ");
		HashMap<String, Integer> h= new HashMap<>();
		
		for (int i = 0; i < s.length; i++) 
		{
			int c=1;
			if(!h.containsKey(s[i]))
			{
				h.put(s[i], c);
			}
			else
			{
				h.put(s[i], h.get(s[i])+1);
			}
			
		}
		for (Entry<String, Integer> entry : h.entrySet()) 
		{
			System.out.println(entry);
		}
//		for (int i = 0; i < s.length; i++) 
//		{
//			int c=0;
//			for (int j = 0; j < s.length; j++) 
//			{
//				if(s[i].equals(s[j]))
//				{
//					if(i>j)
//					{
//						break;
//					}
//					c++;
//				}
//			}
//			if(c>=1)
//			{
//				System.out.println(s[i]+"--->"+c);
//			}
//		}

//		String s="selenium";
//		for (int i = 0; i < s.length(); i++) 
//		{
//			for (int j = i+1; j <= s.length(); j++) 
//			{
//				System.out.println(s.substring(i,j));
//			}
//		}
//		String s="seleniumjavaselenium";
//		TreeSet<String> t= new TreeSet<>();
//		for (int i = 2; i <= s.length(); i++) 
//		{	
//			String s1 = s.substring(i-2,i);
//			t.add(s1);		
//		}
//		for (String v:t) 
//		{
//			System.out.println(v);
//			
//		}

//		String s="seleniumjavaselenium";
//		ArrayList<String> a= new ArrayList<>();
//		for (int i = 3; i <= s.length(); i++) 
//		{	
//			String s1 = s.substring(i-3,i);
//			a.add(s1);		
//		}
//		for(int i=0;i<a.size();i++)
//		{
//			int c=0;
//			for(int j=0;j<a.size();j++)
//			{
//				if(a.get(i).equals(a.get(j)))
//				{
//					if(i>j)
//					{
//						break;
//					}
//					c++;
//				}
//			}
//			if(c==1)
//			{
//				System.out.println(a.get(i)+"--->"+c);
//			}
//			
//		}

//		String s="aabbabc";
//		for (int i = 0; i < s.length(); i++) 
//		{
//			int c=1;
//			for(int j=i+1;j < s.length();j++)
//			{
//				if(s.charAt(i)==s.charAt(j))
//				{
//					c++;
//					i++;
//				}
//				else
//				{
//					break;
//				}
//			}
//			System.out.print(s.charAt(i)+""+c);
//		}

		// ip[1,2,3,4,5] key=2 op[3,4,5,1,2]

//		int[] a = { 1, 2, 3, 4, 5 };
//		int key = 2;
//		for (int j = 0; j < key; j++) 
//		{
//			int f = a[0];
//			for (int i = 0; i < a.length - 1; i++) 
//			{
//				int t = a[i];
//				a[i] = a[i + 1];
//				a[i + 1] = t;
//			}
//			a[a.length - 1] = f;
//		}
//		for (int j = 0; j < a.length; j++) 
//		{
//			System.out.println(a[j]);
//		}

//		String s1 = "abcdefgggab";
//		String[] s = s1.split("");
//		HashMap<String, Integer> h = new HashMap<>();
//
//		for (int i = 0; i < s.length; i++) 
//		{
//			int c = 1;
//			if (!h.containsKey(s[i])) {
//				h.put(s[i], c);
//			} else {
//				h.put(s[i], h.get(s[i])+1);
//			}
//		}
//		for (Entry<String, Integer> entry : h.entrySet()) 
//		{
//			System.out.println(entry);
//		}
//		
//		Object[] ar = h.values().toArray();
//		Arrays.sort(ar);
//		Object x=null;
//		int j=0;
//		for (int i = ar.length-1; i >0; i--) 
//		{
//			if(ar[i]!=ar[i-1])
//			{
//				x = ar[i-1];
//				j++;
//				if(j==2)
//				break;
//			}
//		}
//		System.out.println((int)x);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
