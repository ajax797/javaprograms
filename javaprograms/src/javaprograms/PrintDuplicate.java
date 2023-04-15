package javaprograms;

public class PrintDuplicate 
{

	public static void main(String[] args) 
	{
		int arr[]= {1,2,5,4,1,4,4,5,5,5};
		for(int i=0;i<arr.length-1;i++)
		{
			int count=0;
			for(int j=i+1;j<arr.length;j++)
			{ 
				if(arr[i]==arr[j])
				{
					if(count==0||count==1)
					{
						System.out.println(arr[i]);
						count++;
						break;
					}
				}
			}
		}
	}

}
