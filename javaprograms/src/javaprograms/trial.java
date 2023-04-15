package javaprograms;


public class trial {

	public static void main(String[] args) {
//		int arr[]= {1,2,3,4,5,6,7};
//		int j=0;
//		for(;;)
//		{
//		try 
//		{
//			int x=arr[j];
//			j++;
//			
//		} 
//		catch (Exception e) 
//		{
//			j++;
//			break;
//		}
//		}
//		j=0;
//		for (int i : arr) 
//		{
//			int x=arr[i];
//			j++;
//		}
//		System.out.println(j);

//		int n=4;
//		
//		for (int i =1; i <= n; i++) 
//		{
//			for (int j = 1; j <= i; j++) 
//			{
//				System.out.print(j+" ");
//				
//			}
//			System.out.println();
//			
//		}
//		//////////////////////////
//		int a=1;
//		for (int i =1; i <= n; i++) 
//		{
//			for (int j =1 ; j <=i; j++) 
//			{
//				System.out.print(a+" ");
//				a++;
//			}
//			System.out.println();
//				
//		}

		String st = "sum";
		char[] arr = st.toCharArray();
//		int x=arr.length-1;
//		for(int i=x;i>=0;i--)
//		{
//			for(int k=0;k<x;k++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=arr.length-1;j>=i;j--)
//			{
//				System.out.print(arr[j]);
//			}
//			System.out.println();
//			x--;
//		}
		int sp = arr.length - 1;
		for (int i = 0; i < 2 * arr.length - 1; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (j < sp)
					System.out.print(" ");
				else
					System.out.print(arr[j]);
			}
			if (i < arr.length - 1)
				sp--;
			else
				sp++;
			System.out.println();

		}
//reversing a each word		
		String str = "I am testyantra employee";
		String word[] = str.split(" ");
		String rev = "";
		for (int i = 0; i < word.length; i++) {
			String words = word[i];
			for (int j = words.length() - 1; j >= 0; j--) {
				rev = rev + words.charAt(j);
			}
			rev = rev + " ";
		}
		System.out.println(rev);

		// multiplying elements in an array
		int a[] = { 1, 2, 3, 4 };
		int b[] = { 5, 6 };
		int length = a.length;

		if (a.length < b.length)
			length = b.length;
		int c[] = new int[length];
		for (int i = 0; i < length; i++) {
			try {
				c[i] = a[i] * b[i];
			} catch (Exception e) {
				if (a.length < length) {
					c[i] = b[i];
				} else
					c[i] = a[i];
			}

		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
  String str1="aaabbbccc";
  String str2="";
  
 char ch[] =str1.toCharArray();
 for (int i = 0; i < ch.length; i++) 
 {
	 for(int j=i+1;j<ch.length;j++)
	 {
		 if(ch[i]==ch[j])
		 {
			 str2=str2+ch[j];
			break;
		 }
	 }
 }
 System.out.println(str2);
 
 
}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


