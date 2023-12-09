package day08_Nested_if_Else;

import java.util.Scanner;

public class C01_If_Else {
	public static void main(String[] args) {
		//Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
		//kullaniciya musteri karti olup olmadigini sorun.
		//Musteri karti varsa 10 urunden fazla alirsa %20, az alirsa %15 indirim yapin,
		//Musteri karti yoksa 10 urunden fazla alirsa %15, az alirsa %10 indirim yapin

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ürün Adedini Giriniz: ");
		int urunAdedi = scanner.nextInt();
		System.out.println("İndirimsiz Fiyatı Giriniz: ");
		double indirimsizFiyat = scanner.nextDouble();

		System.out.println("Müşteri Kartınız VArmı : E-Evet H-Hayır  : ");
		char kartVarmi = scanner.next().toUpperCase().charAt(0);

		//double indirimliToplamSatisFiyati = 0;

		if (kartVarmi == 'E' && urunAdedi > 10) {
			System.out.println("%20 indirimli toplam fiyat : " + urunAdedi * indirimsizFiyat * 0.8);
		} else if (kartVarmi == 'E' && urunAdedi <= 10) {
			System.out.println("%15 indirimli toplam fiyat : " + urunAdedi * indirimsizFiyat * 0.85);
		} else if (kartVarmi == 'H' && urunAdedi > 10) {
			System.out.println("%15 indirimli toplam fiyat : " + urunAdedi * indirimsizFiyat * 0.85);
		} else if (kartVarmi == 'H' && urunAdedi <= 10) {
			System.out.println("%10 indirimli toplam fiyat : " + urunAdedi * indirimsizFiyat * 0.9);
		} else {
			System.err.println("Girilen Değerlerde HATA Var!");
		}


	}
}
