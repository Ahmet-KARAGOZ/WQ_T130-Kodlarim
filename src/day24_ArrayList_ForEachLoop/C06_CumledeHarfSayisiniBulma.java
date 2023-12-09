package day24_ArrayList_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C06_CumledeHarfSayisiniBulma {
	public static void main(String[] args) {
		/*
		Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Cümle giriniz : ");
		String cumle = scanner.nextLine();

		System.out.print("Aranacak harfi girniz : ");
		String harf = scanner.next().substring(0,1);

		String[] cumleHarfArrayi = cumle.split("");

		System.out.println("cumleHarfArrayi = " + Arrays.toString(cumleHarfArrayi));

		int sayac = 0;
		for (String each:cumleHarfArrayi ) {
			if (each.equalsIgnoreCase(harf)){
				sayac++;
			}
		}

		if (sayac>0) System.out.println("Arasığınız harf "+ sayac + " kere kullanılmış" );
		else System.out.println("Harf cümlede kullanılmamıştır.");
	}
}
