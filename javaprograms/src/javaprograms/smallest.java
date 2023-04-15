package javaprograms;

public class smallest 
{
	public static void main(String[] args)
	{
		int arr[]= {8,2,5,4,1,4,4,5,5,5};
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println(smallest);
	}
		
}


