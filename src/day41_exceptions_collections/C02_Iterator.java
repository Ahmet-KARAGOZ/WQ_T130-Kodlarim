package day41_exceptions_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {
	public static void main(String[] args) {
		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(5);
		sayilar.add(1);
		sayilar.add(7);
		sayilar.add(3);

		System.out.println(sayilar);

		//Index kullanmadan şistedeki sayıları 2 şer arttırın.

		for (Integer each : sayilar) {
			System.out.print(each + 2 + " ");
		}
		System.out.println("");
		System.out.println("sayilar = " + sayilar);

		//Biz java da çoklu obje bulunduran her yapı index i desteklemez
		//İndex olmadan da bazı işlemleri yapabilmek için java iterator interface ini oluşturmuştur.

		//iterator ile tüm sayılatı toplayın:
		Integer toplam = 0;

		Iterator iterator = sayilar.iterator();

		System.out.println(iterator.hasNext()); //Yanında eleman varsa true yoksa false döndürür.

		toplam += (Integer) iterator.next();  // iterator ı yanındaki sayıdan sonraya geçirir ve geçtiği sayıyı bize döndürür.
		toplam += (Integer) iterator.next();
		toplam += (Integer) iterator.next();
		toplam += (Integer) iterator.next(); // itertor en sonda kalır Burada 3 ün sağında kaldı. 5173

		System.out.println("toplam = " + toplam); //16

		iterator = sayilar.iterator();

		//Listedeki tüm sayıları iterator ile silin!

		while (iterator.hasNext()){ //yanında eleman oldukç true döner
			iterator.next();
			iterator.remove();
		}

		System.out.println(sayilar); //[]




	}
}
