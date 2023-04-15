package javaprograms;

public class AllZerosToFirst {

	public static void main(String[] args) 
	{
		int arr[]= {0,1,4,5,0,5,0,8,0,500,60,0,0,0,80};
		
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==0)
			{
				for (int j = i; j>0; j--) 
				{
					int t=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=t;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}
}
