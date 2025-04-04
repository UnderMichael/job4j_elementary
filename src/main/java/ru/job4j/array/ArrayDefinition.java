package ru.job4j.array;

public class ArrayDefinition {
	public static void main(String[] args) {
		short[] ages = new short[10];
		String[] surnames = new String[100500];
		float[] prices = new float[40];
		System.out.println("length of ages is " + ages.length);
		System.out.println("length of surnames is " + surnames.length);
		System.out.println("length of prices is " + prices.length);

		String[] names = new String[4];
		names[0] = "john";
		names[1] = "bob";
		names[2] = "tom";
		names[3] = "lui";
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
	}
}
