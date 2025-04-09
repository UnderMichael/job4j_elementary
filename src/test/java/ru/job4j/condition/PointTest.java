package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

	@Test
	void whenPoints04And4Minus5Then8Dot06() {
		int x1 = 0, y1 = 2, x2 = 4, y2 = -5;
		double expected = 8.06;
		double output = new Point(x1, y1).distance(new Point(x2, y2));
		assertThat(output).isEqualTo(expected, withPrecision(0.01));
	}

	@Test
	void whenPoints04And4Minus5AndMinus4532Then75Dot43() {
		int x1 = 0, y1 = 2, x2 = 4, y2 = -5, z1 = -43, z2 = 32;
		double expected = 75.43;
		double output = new Point(x1, y1, z1).distance3d(new Point(x2, y2, z2));
		assertThat(output).isEqualTo(expected, withPrecision(0.01));
	}

	@Test
	void whenPoints36And3Minus4Then7Dot61() {
		int x1 = 3, y1 = 3, x2 = 6, y2 = -4;
		double expected = 7.61;
		double output = new Point(x1, y1).distance(new Point(x2, y2));
		assertThat(output).isEqualTo(expected, withPrecision(0.01));
	}

	@Test
	void whenPoints36And3Minus4AndMinus34Then10Dot34() {
		int x1 = 3, y1 = 3, x2 = 6, y2 = -4, z1 = -3, z2 = 4;
		double expected = 10.34;
		double output = new Point(x1, y1, z1).distance3d(new Point(x2, y2, z2));
		assertThat(output).isEqualTo(expected, withPrecision(0.01));
	}

	@Test
	void whenPoints06And0Minus4Then7Dot21() {
		int x1 = 0, y1 = 0, x2 = 6, y2 = -4;
		double expected = 7.21;
		double output = new Point(x1, y1).distance(new Point(x2, y2));
		assertThat(output).isEqualTo(expected, withPrecision(0.01));
	}

	@Test
	void whenPoints06And0Minus4And34Then7Dot28() {
		int x1 = 0, y1 = 0, x2 = 6, y2 = -4, z1 = 3, z2 = 4;
		double expected = 7.28;
		double output = new Point(x1, y1, z1).distance3d(new Point(x2, y2, z2));
		assertThat(output).isEqualTo(expected, withPrecision(0.01));
	}

	@Test
	void whenPointsMinus2Minus6AndMinus6Minus4Then4Dot47() {
		int x1 = -2, y1 = -6, x2 = -6, y2 = -4;
		double expected = 4.47;
		double output = new Point(x1, y1).distance(new Point(x2, y2));
		assertThat(output).isEqualTo(expected, withPrecision(0.01));
	}

	@Test
	void whenPointsMinus2Minus6AndMinus6Minus4And73Then6() {
		int x1 = -2, y1 = -6, x2 = -6, y2 = -4, z1 = 7, z2 = 3;
		double expected = 6;
		double output = new Point(x1, y1, z1).distance3d(new Point(x2, y2, z2));
		assertThat(output).isEqualTo(expected, withPrecision(0.01));
	}
}