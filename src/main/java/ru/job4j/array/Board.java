package ru.job4j.array;

public class Board {
	public static void main(String[] args) {
		paint(3, 3);
		System.out.println();
		paint(4, 4);
	}

	public static void paint(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("x");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
