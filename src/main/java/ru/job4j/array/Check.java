package ru.job4j.array;

public class Check {
	public static boolean mono(boolean[] data) {
		boolean result = true;
		boolean template = data[0];
		for (boolean value : data) {
			if (value != template) {
				result = false;
				break;
			}
		}
		return result;
	}
}
