package javaprograms;

public class CountVowelsConsonents {

	public static void main(String[] args) {
		String str="testyantra";
		String str1 = str.toLowerCase();
		int count=0;
		int count1=0;
		char[] arr = str1.toCharArray();
		for (char c : arr) 
		{
			if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		System.out.println("Vowels count "+count1);
		System.out.println("Consonent count "+count);
	}

}
