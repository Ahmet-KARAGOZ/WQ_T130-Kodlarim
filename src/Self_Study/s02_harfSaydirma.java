package Self_Study;

public class s02_harfSaydirma {
	public static void main(String[] args) {
		/*
		Write a Java function to perform basic string compression using the counts of repeated characters.
		For example, the string "aabcccccaaab" would become "a2b1c5a3b1".
		 */

		String str = "aabcccccaaab";
		int adet = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				adet++;

			} else {
				System.out.print(""+str.charAt(i) + adet);
				adet = 1;
			}
			if (i == str.length() - 2) {
				System.out.print("" + str.charAt(str.length() - 1) + adet);
			}

		}


	}
}
