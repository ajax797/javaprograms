package javaprograms;

public class count0sAnd1s {

	public static void main(String[] args) 
	{
		int arr[]= {0,1,0,1,0,0,0,1};
		int count=0;
		int count1=0;
		for (int i : arr) 
		{
			if(arr[i]==0)
			{
				count++;
			}
			else if(arr[i]==1)
			{
				count1++;
			}
			else {}
		}
		System.out.println("0's count --->"+count);
		System.out.println("1's count --->"+count1);
	}

}
