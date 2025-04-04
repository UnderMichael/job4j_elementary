package ru.job4j.loop;

public class Savings {
	public static int years(double goal, double annualDeposits, double percent) {
		int years = 0;
		double total = 0;
		do {
			years++;
			total += total / 100 * percent;
			total += annualDeposits;
		} while (total < goal);
		return years;
	}
}
