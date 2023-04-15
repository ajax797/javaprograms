package javaprograms;

public class Largest
{
	public static void main(String[] args) 
	{
		int arr[]= {8,2,5,4,1,4,4,5,5,5};
		int largest=arr[0];
		int large2=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{     
				large2=largest;
				largest=arr[i];
			}
			else if(arr[i]>large2||large2==largest)
			{
				large2=arr[i];
			}
		}
		System.out.println(large2);
	}

}
