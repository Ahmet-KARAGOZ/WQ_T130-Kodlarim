package day21_arrays_MultiDimensionalArrays;

public class C05_MDAtumEşementleriGozdenGecirme {
	public static void main(String[] args) {

		int[] arrT = {3, 4, 6, 9, 0, 2, 5, 6, 8, 1};
		int toplam = 0;
		for (int i : arrT) {
			if ((i % 2) == 0) toplam += i;
		}
		System.out.println("Çift Sayılar Toplamı = " + toplam);

		int[][] arrIki = {{3, 4, 6}, {9, 0}, {2, 5, 6, 8, 1}};

		//Enhamce Loop ile yapımı
		toplam = 0;
		for (int[] ints : arrIki) {
			for (int anInt : ints) {
				if ((anInt % 2) == 0) toplam += anInt;
			}
		}
		System.out.println("Toplam Multi = " + toplam);

		// For Loop ile yapımı
		toplam=0;
		for (int i = 0; i < arrIki.length; i++) {
			for (int j = 0; j < arrIki[i].length; j++) {
				if ((arrIki[i][j] % 2) == 0) toplam += arrIki[i][j];
			}
		}

	}
}
