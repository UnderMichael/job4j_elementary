package ru.job4j.loop;

public class Fitness {
	public static int calc(int ivan, int nik) {
		int months = 0;
		while (ivan <= nik) {
			months++;
			nik *= 2;
			ivan *= 3;
		}
		return months;
	}
}
