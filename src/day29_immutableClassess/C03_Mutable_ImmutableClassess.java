package day29_immutableClassess;

import java.util.ArrayList;
import java.util.List;

public class C03_Mutable_ImmutableClassess {
	public static void main(String[] args) {

		/*
		String classı IMMUTABLE olduğundan dolayı method ile yapılan değişiklikler kalıcı değişiklik yapmaz.
		sadece o satır için değişikliği uygular.

		ANCAKKK

		ArrayList MUTABLE olduğundan
		method ile yapılan değişiklikler kalıcı olur.

		 */
		String isim = "Ramazan";
		isim.toUpperCase();
		isim.replace("a","i");
		isim.concat(" Tatar");

		System.out.println("isim = " + isim);

		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(10);
		sayilar.add(20);
		sayilar.add(30);
		sayilar.remove(1);
		sayilar.set(1,40);

		System.out.println("sayilar = " + sayilar);


	}
}
