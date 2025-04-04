package ru.job4j.array;

public class SortSelected {
	public static int[] sort(int[] data) {
		for (int index = 0; index < data.length; index++) {
			int min = MinDiapason.findMin(data, index, data.length - 1);
			int minIndex = FindLoop.indexOf(data, min);
			data = SwitchArray.swap(data, minIndex, index);
		}
		return data;
	}
}
