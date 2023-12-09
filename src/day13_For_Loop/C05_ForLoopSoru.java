package day13_For_Loop;

import java.util.Scanner;
////Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
//         sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
//          Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
//
public class C05_ForLoopSoru {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Başlangıç ve bitiş değerlerini yazdırınız : ");
		int baslangıic = scanner.nextInt();
		int bitis = scanner.nextInt();
		int toplam = 0;
		if (bitis<baslangıic){
			System.out.println("Bitiş başlangıçtan küçük olamaz");
		} else {
			for (int i = baslangıic; i <=bitis ; i++) {
				toplam = toplam+i;
			}
			System.out.println("toplam = " + toplam);
		}


	}
}
