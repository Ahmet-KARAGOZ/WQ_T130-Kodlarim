package day28_passByValue;

public class C03_passByValue {
	public static void main(String[] args) {
		//verilen fiyat üzerinden %10 indirimli fiyat hesaplayıp indirimli fiyatı yazdıran bir method oluşturun.

		// farklı scopların içinde aynı isimde variable'lar olabilir. Bu variable'larda yapılan değişikler sadece içinde oldukları scopta geçerlidir.

		double fiyat = 200;
		yuzde10InirimliFiyatYazdir(fiyat);
		System.out.println("fiyat = " + fiyat);


	}

	public static void yuzde10InirimliFiyatYazdir(double fiyat) {
		fiyat = fiyat * 90 / 100;
		System.out.println("İndirimli fiyat : " + fiyat);
	}
}
