package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckedExceptions {
	public static void main(String[] args) {
		String dosyaYolu = "src/day40_exceptions/yazi.txt";
		try {
			FileInputStream fis = new FileInputStream(dosyaYolu);
		} catch (FileNotFoundException e) {

		}

		

	}
}
