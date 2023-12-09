package day13_For_Loop;

public class C02_ForLoop {
	public static void main(String[] args) {

		//60 tan 23 e kadar (dahil) 7 ye bölünebilen sayıları bulunuz.
		for (int i = 60; i >= 23; i--) {
			if (i % 7 == 0) {
				System.out.print(" i = " + i);
			}
		}

		System.out.println("\n");
		//3 basamaklı pozitif sayılar toplamı
		int toplam = 0;
		for (int i = 100; i < 1000; i++) {
			toplam = toplam + i;
		}
		System.out.println("toplam = " + toplam);

		System.out.println("\n");
		//-1000 ile 1000 arasındaki sayıların toplamı
		toplam = 0;
		for (int i = -1000; i <= 1000; i++) {
			toplam = toplam + i;
		}
		System.out.println("toplam = " + toplam);
	}
}
