package day42_listiterator_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C01_List_Iterator {
	public static void main(String[] args) {

		//ListIterator Iterator interface ine göre daha fazla özelliğe sahiptir.
		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(5);
		sayilar.add(1);
		sayilar.add(7);
		sayilar.add(3);

		System.out.println(sayilar);

		ListIterator lit = sayilar.listIterator();

		while (lit.hasNext()) {
			Integer sayi = (Integer) lit.next();
			lit.set(sayi + 2);
		}
		System.out.println(sayilar);

		//index kullanmadan sondan başa doğru yazdırın.
		while (lit.hasPrevious()) {
			System.out.print(lit.previous() + " ");
		}
		System.out.println("");

		//index kullanmadan tekrar sondan başa yazdırın

		while (lit.hasNext()) { //Bu loop iteratoru sona götürür.
			lit.next();
		}
		while (lit.hasPrevious()) {
			System.out.print(lit.previous() + " ");
		}
		System.out.println("");

		//Tüm elementleri gözden geçirip 5 ten büyük olanları olanları silin

		//ilk akla gelmesi gerek niterator nerede?

		//hocam set kullandığımız yeri tekrar anlatır mısınız
		lit = sayilar.listIterator();

		while (lit.hasNext()) {
			if ((Integer) lit.next() > 5) {
				lit.remove();
			}
		}
		System.out.println(sayilar);

		//0'dan büyük olanlara 7 ekleyin.

		lit = sayilar.listIterator();
		while (lit.hasNext()){
			Integer sayi = (Integer) lit.next();
			if (sayi>0){
				lit.set(sayi+7);
			}
		}
		System.out.println("sayilar = " + sayilar);

	}
}
