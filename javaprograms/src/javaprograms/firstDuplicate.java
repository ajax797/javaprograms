package javaprograms;

public class firstDuplicate {

	public static void main(String[] args) {
		String s = "selenium";
		// op--- e
		for (int i = 0; i < s.length(); i++) {
			if (s.lastIndexOf(s.charAt(i)) > i) {
				System.out.println(s.charAt(i));
				//break;
			}

		}

	}

}
