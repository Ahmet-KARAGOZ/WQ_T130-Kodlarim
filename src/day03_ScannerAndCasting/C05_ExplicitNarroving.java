package day03_ScannerAndCasting;

public class C05_ExplicitNarroving {

	public static void main(String[] args) {

		double dbl = 34.7;
		int sayi = (int) dbl;

		System.out.println(sayi); //34 Ondalıklı kısmı siler!

		int sayi1 = 23;
		byte byt = (byte) sayi1;
		System.out.println(byt);

		int sayi2 = 130;
		byt = (byte) sayi2;
		System.out.println(byt);

		int sayi3 = 230;
		byt = (byte) sayi3;
		System.out.println(byt);

		char ch = 'A';
		int sayi4 = ch;
		System.out.println(sayi4); //ASCII kodunu atıyor.

		int sayi5 = 66;
		char ch1 = (char) sayi5;
		System.out.println(ch1);

		System.out.println('a' + 'b'); // ASCII kodlarını topluyor.

		char ch2=101;
		System.out.println(ch2);


	}
}
