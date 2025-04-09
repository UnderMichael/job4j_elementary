package ru.job4j.condition;

public class Max {

	public static int max(int x, int y) {
		return x > y ? x : y;
	}

	public static int max(int x, int y, int z) {
		return max(max(x, y), z);
	}

	public static int max(int x, int y, int z, int n) {
		return max(max(x, y, z), n);
	}
}
