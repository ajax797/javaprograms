package javaprograms;

public class Consecutive {

	public static void main(String[] args) {
		
		String s = "aaabba";
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int count=1;
			while(i+1<s.length() && ch==s.charAt(i+1) ) {
				count++;
				i++;
			}
			System.out.println(ch+""+count);
		}

	}

}
