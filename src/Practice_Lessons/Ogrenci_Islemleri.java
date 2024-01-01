package Practice_Lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ogrenci_Islemleri implements I_islemler{
	Scanner scanner = new Scanner(System.in);
	int number = 1000;
	List<ogrenci> ogrenciList = new ArrayList<>();
	void ogrMenu(){
		System.out.println("============= ÖĞRENCİ İŞLEMLER =============\n" +
				"\t\t1-EKLEME\n" +
				"\t\t2-ARAMA\n" +
				"\t\t3-LİSTELEME\n" +
				"\t\t4-SİLME\n" +
				"\t\t5-ANA MENÜ\n" +
				"\t\tQ-ÇIKIŞ\n" +
				"\n" +
				"\tSEÇİMİNİZ:");
		char secim = scanner.next().toUpperCase().charAt(0);
		switch (secim){
			case '1' : ekleme(); break;
			case '2' : arama(); break;
			case '3' : listeleme(); break;
			case '4' : silme(); break;
			case '5' : anaMenu(); break;
			case 'Q' : cikis(); break;
			default:{
				System.out.println("Hatalı giriş yaptınız....");
			}
		}
	}

	@Override
	public void ekleme() {
		System.out.println("====================================================");
		System.out.println("Yeni Öğrenci Bilgi Giriş Ekranı");
		System.out.println("====================================================");

		scanner.nextLine(); //Dummy Code

		System.out.print("Öğrenci Adı : ");
		String firstName = scanner.nextLine();

		System.out.print("Öğrenci Soyadı : ");
		String surName = scanner.nextLine();

		System.out.print("TC Kimlik Numarası : ");
		String tcNumber = scanner.nextLine();

		System.out.print("Yaşı : ");
		int age = scanner.nextInt();

		System.out.print("Sınıfı : ");
		int sinif = scanner.nextInt();

		ogrenci ogrenci = new ogrenci(firstName, surName, tcNumber, age, number++, sinif);
		ogrenciList.add(ogrenci);
		System.out.println(" ");
		System.out.println("İşlem Tamamlandı...");
		System.out.println("----- Öğrenci Bilgileri ----- \n");
		listeleme();
		ogrMenu();

	}

	@Override
	public void arama() {
		scanner.nextLine();
		System.out.print("Aradığının TCKN numarasını giriniz : ");
		String tcNumber = scanner.nextLine();

		for (ogrenci each : ogrenciList){
			if (each.getTcNumber().equals(tcNumber)){
				System.out.println("Aranan Kişi : " + each);

				ogrMenu();
			} else 	{
				System.out.println("Kayıtlarımızda "+tcNumber+" ile kayıtlı biri yoktur.");
				ogrMenu();
			}
		}

	}

	@Override
	public void listeleme() {
		for (ogrenci each : ogrenciList){
			System.out.println(each);
		}

	}

	@Override
	public void silme() {
		System.out.println("Silinecek kişinin TCKN numarasını giriniz : ");
		String tcNumber = scanner.nextLine();
		boolean  flag = true;

		for (int i = 0; i < ogrenciList.size(); i++) {
			if (ogrenciList.get(i).getTcNumber().equals(tcNumber)){
				System.out.println(ogrenciList.get(i)+" kişisi bilgileriyle silinecek...");
				ogrenciList.remove(i);
				flag= false;
				listeleme();
			}
		}
		if (flag){
			System.out.println(tcNumber+ " TCKN ile kayıt bulunamadı....");
			ogrMenu();
		}

	}

	@Override
	public void anaMenu() {
		AnaMenu anaMenu = new AnaMenu();
		anaMenu.menu();

	}

	@Override
	public void cikis() {
		System.exit(0);
	}
}
