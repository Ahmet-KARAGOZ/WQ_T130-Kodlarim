package day10_StringManipulations;

import java.util.Locale;

public class C02_StringManDers {
	public static void main(String[] args) {
		String str = "Java candır";
		str = str.toUpperCase();
		System.out.println(str);

		System.out.println(str.toLowerCase());
		System.out.println(str.toLowerCase(Locale.forLanguageTag("TR")));
	}
}
