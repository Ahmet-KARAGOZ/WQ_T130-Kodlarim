package day14_ForLoopExamples;

public class C06_NestedForLoop {
	public static void main(String[] args) {


		/*
		1 2 3 4
		2 4 6 8
		3 6 9 12
		dışardaki loop satırları
		içerdeki loop satırlardaki sutunları
		kontrol eder.
		 */
		 /*
            for loop kullanarak
            1 2 3 4
            2 4 6 8
            3 6 9 12
            yazdirin
            Eger yazdirmamiz istenen sekil dikdortgen biciminde ise
            ic ice 2 loop olustururuz
            disardaki loop satirlari kontrol eder (bu soruda 3 satir var)
            icerdeki loop ise her satirdaki sutunlari kontrol eder
            ( bu soruda her satirda 4 sutun var)
         */

		for (int i = 1; i <=3 ; i++) { //satırları
			for (int j = 1; j <=4 ; j++) { //satırlardaki sutunları
				System.out.print(i*j+" ");
			}
			System.out.println("");
		}


	}
}
