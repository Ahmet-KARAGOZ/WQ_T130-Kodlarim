package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_CokluCheckedException {
	public static void main(String[] args)  {
		String dosyayolu = "src/day40_exceptions/yazi.txt";
		try {
			FileInputStream fis = new FileInputStream(dosyayolu); //doyaya ulaşma

			int k = 0;
			while ((k = fis.read())!=(-1)) { //dosyayi okuyup bize getirme
				System.out.print((char) k);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Dosya yolunda hata var");
		}
		catch (IOException e) {
			System.out.println("Dosya okunurken hata oluştu");
		}
		catch (Exception e) {
			System.out.println("Öngörülemeyen bir exception oluştu");
		}

	}
}
