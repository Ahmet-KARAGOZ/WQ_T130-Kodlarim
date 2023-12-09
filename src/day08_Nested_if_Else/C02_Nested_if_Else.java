package day08_Nested_if_Else;

import java.util.Scanner;

public class C02_Nested_if_Else {
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
		int indirimOrani = 0;

		if (kartVarmi=='E'){
			if (urunAdedi>10){
				indirimOrani=20;
			} else if (urunAdedi>0){
				indirimOrani=15;
			} else {
				System.out.println("Hatalı Ürün Miktarı");
			}
		} else if (kartVarmi=='H') {
			if (urunAdedi>10){
				indirimOrani=15;
			} else if (urunAdedi>0) {
				indirimOrani=10;
			}else {
				System.out.println("urun miktarı hatalı");
			}
		}else {
			System.out.println("Kart Bilgisi Hatalı !");
		}

		if (indirimOrani>0){
			System.out.println(indirimOrani + " indirimli toplam fiyat : " +
					indirimsizFiyat*urunAdedi*(100-indirimOrani) /100);
		}


	}
}
