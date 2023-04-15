package javaprograms;

public class removeDubliWords {

	public static void main(String[] args) 
	{
		String s="this is fun show";
		String s1="fun tv show";
		//op_-- this is tv
		String s3 = s+" ".concat(s1);
		String res="";
		String[] arr = s3.split(" ");
		for (int i = 0; i < arr.length; i++) 
		{
			int count=0;
			for (int j = 0; j < arr.length; j++) 
			{
				if(arr[i].equals(arr[j]))
				{
					if(i>j)
					{
						break;
					}
					count++;
				}
				
			}
			if(count==1)
			{
				res=res+" "+arr[i];
			}
			
		}
		System.out.println(res.trim());
		

	}

}
