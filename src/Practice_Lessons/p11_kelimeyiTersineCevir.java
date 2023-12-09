package Practice_Lessons;

public class p11_kelimeyiTersineCevir {
	public static void main(String[] args) {
		// SORU:kullanıcıdan bir cümle veya kelime girmesini isteyip
		// girilen değeri tersine  yazdıran bir method oluşturun

		System.out.println(tersCevir("Ahmet"));

		int[] denemelik = {2,3,65,398,3,154,646,65};
		for (int x: denemelik) {
			System.out.println(x);
		}


	}

	public static String tersCevir(String word) {
		String bosKova = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			bosKova += word.charAt(i);
		}
		return bosKova;
	}
}
