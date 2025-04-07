package ru.job4j.array;

import java.util.Arrays;

public class Machine {
	public static int[] change(int money, int price) {
		int[] coins = {10, 5, 2, 1};
		int[] result = new int[100];
		int size = 0;
		money -= price;
		while (money > 0) {
			for (int coin : coins) {
				if (coin <= money) {
					money -= coin;
					result[size] = coin;
					size++;
					break;
				}
			}
		}

		return Arrays.copyOf(result, size);
	}
}
