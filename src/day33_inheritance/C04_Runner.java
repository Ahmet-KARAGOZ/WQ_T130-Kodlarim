package day33_inheritance;

public class C04_Runner {
	public static void main(String[] args) {
		C03_DizelCorolla dc1 = new C03_DizelCorolla();


		System.out.println(dc1.marka); //Toyata
		System.out.println(dc1.model); //Coralla
		System.out.println(dc1.motor); //Dizel motor
		System.out.println("dc1.yakit = " + dc1.yakit);
		System.out.println("dc1.uretimYeri = " + dc1.uretimYeri);
		System.out.println("dc1.sanzuman = " + dc1.sanzuman);
		System.out.println("dc1.aku = " + dc1.aku);
		System.out.println("dc1.guvenlik = " + dc1.guvenlik);
		System.out.println("dc1.teker = " + dc1.teker);
		System.out.println("dc1 = " + dc1.renk);
		System.out.println("dc1 = " + dc1.fren);


	}
}
