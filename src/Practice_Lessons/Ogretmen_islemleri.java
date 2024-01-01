package Practice_Lessons;

import java.util.Scanner;

public class Ogretmen_islemleri  implements I_islemler{
	Scanner scanner = new Scanner(System.in);
	void ogrtMenu(){
		System.out.println("============= ÖĞRETMEN İŞLEMLER =============\n" +
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
			case 'Q' : cikis();
		}
	}


	@Override
	public void ekleme() {

	}

	@Override
	public void arama() {

	}

	@Override
	public void listeleme() {

	}

	@Override
	public void silme() {

	}

	@Override
	public void anaMenu() {

	}

	@Override
	public void cikis() {

	}
}
