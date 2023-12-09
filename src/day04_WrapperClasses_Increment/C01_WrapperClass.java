package day04_WrapperClasses_Increment;

public class C01_WrapperClass {
	public static void main(String[] args) {

		String str = "Java Candır";
		System.out.println(Integer.MAX_VALUE);

		String sayi1 = "103";
		String sayi2 = "204";

		System.out.println(sayi1 + sayi2);

		int sayi1Deger = Integer.parseInt(sayi1);
		int sayi2Degeri = Integer.valueOf(sayi2);

		System.out.println(sayi1Deger + sayi2Degeri);

		char chr1 = '7';
		char chr2 = 'r';
		char chr3 = '#';

		System.out.println(Character.isLetter(chr1));
		System.out.println(Character.isLetter(chr2));

		System.out.println(Character.isAlphabetic(chr3));
		System.out.println(Character.toUpperCase(chr2));



	}
}
