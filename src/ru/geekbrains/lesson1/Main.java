package ru.geekbrains.lesson1;

public class Main {

	public static void main(String[] args) {
		byte a = 77;
		short i = -1342;
		int p = 2786;
		long s = -89271341;
		float v = 253.0f;
		double w = 765.8657;
		boolean q = true;
		char c = 'H';

		System.out.println("Сумма a, b, c, d: " + score(10, 12, 12, 3));
		System.out.println("Сумма a и b между 10 и 20 (включительно)? " + check(10, 12));
		System.out.println(plus(-26));
		System.out.println(minus(-79));
		name("Оксана");
		System.out.println(year(1908));

	}

	public static int score(int a, int b, int c, int d) {
		int res = a * (b + (c / d));
		return res;
	}

	public static boolean check(int a, int b) {
		int sum = a + b;
		if ((10 <= sum) & (sum <= 20)) {
			return true;
		} else {
			return false;
		}

	}

	public static String plus(int a) {
		String res;
		if (a >= 0) {
			res = ("Число положительно");
		} else {
			res = ("Число отрицательно");
		}
		return res;
	}

	public static boolean minus(int a) {
		if (a < 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void name(String n) {
		System.out.println("Привет, " + n + "!");
	}

	public static String year(int y) {
		String u;
		if (((y % 4) == 0) && ((y % 100) != 0) || (y % 400 == 0)) {
			u = ("Год високосный");
		} else {
			u = ("Год не високосный");
	}
		return u;
	}
}
