package ru.job4j.array;

public class TwoNumberSum {
	public static int[] getIndexes(int[] array, int target) {
		int[] result = new int[2];
		int i = 0;
		int j = 1;
		while (i < array.length) {
			if (array[i] + array[j] == target) {
				result[0] = i;
				result[1] = j;
				return result;
			}
			if (j == array.length - 1) {
				if (i == array.length - 2) {
					break;
				}
				i++;
				j = i + 1;
			}
			j++;
		}

		return new int[0];
	}
}
