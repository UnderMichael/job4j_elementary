package ru.job4j.loop;

public class Frame {
	public static void draw(int size) {
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				boolean isTopOrBottomCorner = row == 1 || row == size;
				boolean isSideBorder = col == 1 || col == size;
				if (isSideBorder && isTopOrBottomCorner) {
					System.out.print("+");
				} else if (isTopOrBottomCorner) {
					System.out.print("-");
				} else if (isSideBorder) {
					System.out.print("|");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		draw(8);
	}
}
