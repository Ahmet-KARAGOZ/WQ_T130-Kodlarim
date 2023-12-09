package Practice_Lessons;

public class p12_doWhile_topZiplatma {
	public static void main(String[] args) {
		// Bir top belirli yükseklikten atılmaktadır.
		// Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
		// Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
		// Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do
		// while code blogu create ediniz.
		double yukseklik = 2.00;
		topuZiplat(12);

	}

	public static void topuZiplat(double cikisNoktasi) {
		double toplamYol = 0;
		int yereVurmaSayisi = 0;

		do {
			toplamYol += cikisNoktasi;
			yereVurmaSayisi++;
			cikisNoktasi = cikisNoktasi * 3 / 4;
			toplamYol += cikisNoktasi;
			System.out.println("cikisNoktasi = " + cikisNoktasi);
		} while (cikisNoktasi >= 1);

		System.out.println("Yere Vurma Sayisi = " + yereVurmaSayisi);
		System.out.println("Toplam Aldığı Yol = " + toplamYol);
	}
}
