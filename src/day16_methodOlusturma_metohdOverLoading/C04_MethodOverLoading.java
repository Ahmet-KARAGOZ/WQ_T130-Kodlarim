package day16_methodOlusturma_metohdOverLoading;

public class C04_MethodOverLoading {
	public static void main(String[] args) {
		toplaYazdir(5, 7);
	}

	public static void toplaYazdir(int sayi1, int sayi2) {
		System.out.println("İki integer toplamı : " + (sayi1 + sayi2));
	}
	public static void toplaYazdir(int sayi1,int sayi2, int sayi3){
		System.out.println("İki integer toplamı : "+(sayi1+sayi2+sayi3));
	}
}
