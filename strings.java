public class strings{

	public static void main(String[] args) {
			String test = "Doug";

			isAbecedarian(test);
			if (isAbecedarian(test)) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
	}

	public static boolean isAbecedarian(String s) {
		int chr =100;
		int result =0;
		for (int i=0; i<s.length(); i++) {
			result=s.charAt(i);
			if (chr<result) {
				return false;
			}
			chr = result;
		}

		return true;
	}
}