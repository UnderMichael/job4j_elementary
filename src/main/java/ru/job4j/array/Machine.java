package ru.job4j.array;

import java.util.Arrays;

public class Machine {
	public static int[] change(int money, int price) {
		int[] coins = {10, 5, 2, 1};
		int[] result = new int[100];
		int size = 0;
		int start = 0;
		while (price < money) {
			for (int i = start; i < coins.length; i++) {
				if (price + coins[i] <= money) {
					price += coins[i];
					result[size] = coins[i];
					size++;
					break;
				} else {
					start = i;
				}
			}
		}

		return Arrays.copyOf(result, size);
	}
}
