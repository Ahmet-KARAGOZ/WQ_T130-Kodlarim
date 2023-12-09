package day13_For_Loop;

public class C01_ForLoop {
	public static void main(String[] args) {

		for (int i = 10; i < 30; i++) {
			System.out.print(" i = " + i);

		}
		System.out.println("\n");

		for (int i = 11; i < 100; i += 2) {
			System.out.print(" i = " + i);
		}
		System.out.println("\n");

		for (int i = 762; i <= 1326; i++) {
			if (i % 19 == 0) {
				System.out.print(" i = " + i);
			}
		}


	}
}
