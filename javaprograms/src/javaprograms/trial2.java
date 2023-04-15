package javaprograms;

import java.util.Scanner;

public class trial2 {

	private static Scanner x;

	public static void main(String[] args) 
	{
		try
		{
		x = new Scanner(System.in);
		System.out.println("Enter count of numbers");
		int count=x.nextInt();
		System.out.println("Enter numbers in range 1-25");
		int[] arr=new int[count];
		for(int i=0;i<count;i++)
		{
			arr[i]=x.nextInt();
		}
		
		for(int j=0;j<arr.length;j++)
		{
			int count1=0;
			for(int k=0;k<arr.length;k++)
			{
				if(arr[j]==arr[k])
				{
					if(k<j)
					{
						break;
					}
					count1++;
				}
			}
			if(count1>=1)
			{
				if(arr[j]<=25)
				{
					System.out.println("Frequency of occurance of "+arr[j]+" is "+count1);
				}
				else
				{
					System.out.println(arr[j]+" is not in range 1-25");
				}
			}
			
		}
		}
		catch (Exception e) 
		{
			System.out.println("Enter valid number");

		}
		

	}
		
}
