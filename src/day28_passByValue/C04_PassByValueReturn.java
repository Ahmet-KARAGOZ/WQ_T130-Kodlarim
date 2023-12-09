package day28_passByValue;

public class C04_PassByValueReturn {


	public static void main(String[] args) {

		//Methodlar arası geçişte veriable'ın kendisi değil değeri yollanır.
		//Her methodun içindeki local variable o methodta geçerli olduğundan main methodta atama varsa main methodtaki fiyat kalıcı değişir.
		// Diğer methodta atama varsa o methodtaki variable değeri değişir.

		//Method her çağırıldığında sanki ilk defa çalışıyor gibi sıfırdan başlar.

		//Verilen bir fiyat için %10 indirimli fiyatı hesaplayıp indirimli fiyatı döndüren bir method oluşturun.

		double fiyat = 200;

		System.out.println(fiyat);
		System.out.println(yuzde10IndirimliFiyatHesapla(fiyat));
		System.out.println(fiyat);

		fiyat = yuzde10IndirimliFiyatHesapla(fiyat);
		System.out.println("fiyat = " + fiyat);

	}

	public static double yuzde10IndirimliFiyatHesapla(double fiyat) {

		fiyat = fiyat * 90 / 100;

		return fiyat;
	}
}
