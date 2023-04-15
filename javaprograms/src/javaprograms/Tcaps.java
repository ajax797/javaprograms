package javaprograms;

public class Tcaps {

	public static void main(String[] args) {
		String str="testyantra";
		String s="";
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='t')
			{
				arr[i]='T';
			}
			s=s+arr[i];
		}
		System.out.println(s);	
	}

}
