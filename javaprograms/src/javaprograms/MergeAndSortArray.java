package javaprograms;

import java.util.ArrayList;
import java.util.Collections;

public class MergeAndSortArray {

	public static void main(String[] args) 
	{
		int a1[]= {6,2,3,4,5};
		int a2[]= {2,4,6,8};
		int a3[]=new int[a1.length+a2.length];
		int k=0;
		for (int i = 0; i < a3.length; i++) 
		{
			if(i<a1.length)
			{
				a3[i]=a1[i];
			}
			else
			{
				a3[i]=a2[k];
				k++;
			}
		}
		ArrayList<Integer> arl=new ArrayList<Integer>();
		for (int i = 0; i < a3.length; i++)
		{
			arl.add(a3[i]);
		}
		Collections.sort(arl);
		
		for (Integer in : arl) 
		{
			System.out.println(in);
		
		}
	}

}
