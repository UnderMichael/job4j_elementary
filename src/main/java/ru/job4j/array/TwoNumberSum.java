package ru.job4j.array;

public class TwoNumberSum {
	public static int[] getIndexes(int[] array, int target) {
		int[] result = new int[2];
		int i = 0;
		int j = array.length - 1;
		while (i < j) {
			int sum = array[i] + array[j];
			if (sum == target) {
				result[0] = i;
				result[1] = j;
				return result;
			}
			if (sum > target) {
				j--;
			} else {
				i++;
			}
		}
		return new int[0];
	}
}
