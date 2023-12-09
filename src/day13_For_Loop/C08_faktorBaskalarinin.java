package day13_For_Loop;

import java.util.Scanner;

public class C08_faktorBaskalarinin {
	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen 20'den kucuk bir pozitif tam sayi giriniz");
		int sayi = scanner.nextInt();
		long faktoriyel = 1;
		System.out.print(sayi + "! = ");
		for (int i = sayi; i >=1 ; i--) {
			faktoriyel*=i;
			System.out.print( i + " * " );
		}
		System.out.println(" = " +faktoriyel);
		 */
/*


		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 20'den kucuk bir sayi giriniz");
		int sayi=scan.nextInt();
		long faktoryel=1;
		System.out.print(sayi+"! = "); //6!=
		for (int i = sayi; i >=1 ; i--) {
			faktoryel*=i;
			if (i !=1){
				System.out.print(i+" * ");
			}else {
				System.out.print(i + " = ");
			}
		}
		System.out.println(faktoryel);
		*/

		Scanner scan = new Scanner(System.in);
		//System.out.println("Lutfen 20'den kucuk bir sayi giriniz");
		long sayi = scan.nextLong();
		long sonuc = 1;
		System.out.print(sayi + " != ");
		for (long i = sayi; i >= 1; i--) {
			sonuc *= i;
			System.out.print(i);
			if (i > 1) {
				System.out.print(" * ");
			}
		}
		System.out.println("= " + sonuc);


	}
}
