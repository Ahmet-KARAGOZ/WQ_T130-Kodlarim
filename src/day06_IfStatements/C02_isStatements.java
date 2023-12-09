package day06_IfStatements;

import java.util.Scanner;

public class C02_isStatements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Bir KArakter giriniz : ");
		char ch =scanner.next().toLowerCase().charAt(0);

		boolean flag = true;

		if (ch=='o'){
			System.out.println("Ocak");
			flag = false;
		}
		if (ch=='s'){
			System.out.println("Subat");
			flag = false;
		}
		if (ch=='m'){
			System.out.println("Mart");
			flag = false;
		}
		if (ch=='n'){
			System.out.println("Nisan");
			flag = false;
		}
		if (ch=='m'){
			System.out.println("Mayıs");
			flag = false;
		}
		if (ch=='h'){
			System.out.println("Haziran");
			flag = false;
		}
		if (ch=='t'){
			System.out.println("Temmuz");
			flag = false;
		}
		if (ch=='a'){
			System.out.println("Agustus");
			flag = false;
		}
		if (ch=='e'){
			System.out.println("Eylül");
			flag = false;
		}
		if (ch=='e'){
			System.out.println("Ekim");
			flag = false;
		}
		if (ch=='k'){
			System.out.println("Kasım");
			flag = false;
		}
		if (ch=='a'){
			System.out.println("Aralık");
			flag = false;
		}

		//if (ch!='o' || ch!='s' || ch!='m' || ch!='n' || ch!='h' || ch!='t' || ch!='a' || ch!='e' || ch!='k'){
		//	System.out.println("Böyle bir ay YOK!");
		//}

		if (flag){
			System.out.println("Böyle bir Ay YOK! flag true kaldı");
		}


	}
}
