package day39_exeptions;

import java.util.Scanner;

public class C05_CatchBlogundaki_e {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Cumle giriniz : ");
		String cumle = scanner.nextLine();
		System.out.print("Tam sayi giriniz : ");
		int index = scanner.nextInt();

		try {
			System.out.println(cumle.charAt(index));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e); //java.lang.StringIndexOutOfBoundsException: String index out of range: 6
			System.out.println("Girilen index cümle sınırları dışında"); //Girilen index cümle sınırları dışında
			System.out.println(e.getCause()); //null
			System.out.println(e.getMessage()); //String index out of range: 5
			//e.printStackTrace();// exception olduğunda yazılan ne varsa yazar
		}
	}
}
