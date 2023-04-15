package javaprograms;

public class RemoveDuplicates
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,5,4,1,4,4,5,5,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{ 
				if(arr[i]==arr[j])
				{
					arr[j]=9999;
				}
			}	
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=9999)
			{
				System.out.print(arr[i]+",");
			}
		}
		
	}

}
