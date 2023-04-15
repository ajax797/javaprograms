package javaprograms;

import java.util.LinkedHashSet;

public class NonDuplicate {

	public static void main(String[] args) {
		String s = "xaabbcde";

		LinkedHashSet<Character> lh = new LinkedHashSet<>();

		for (int i = 0; i < s.length(); i++) {
			lh.add(s.charAt(i));
		}
		
		for(char ch:lh) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(ch);
				break;
			}
		}

	}

}
