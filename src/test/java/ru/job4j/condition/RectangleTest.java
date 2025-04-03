package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleTest {

	@Test
	void whenLength23AndWidth245ThenResult246Dot07() {
		double length = 23, width = 245;
		double expected = 246.07;
		double output = Rectangle.diagonal(length, width);
		assertThat(output).isEqualTo(expected, withPrecision(0.01));
	}

	@Test
	void whenLength231AndWidth123ThenResult261Dot7() {
		double length = 231, width = 123;
		double expected = 261.70;
		double output = Rectangle.diagonal(length, width);
		assertThat(output).isEqualTo(expected, withPrecision(0.01));
	}

	@Test
	void whenLength432AndWidth123ThenResult449Dot16() {
		double length = 432, width = 123;
		double expected = 449.16;
		double output = Rectangle.diagonal(length, width);
		assertThat(output).isEqualTo(expected, withPrecision(0.01));
	}

	@Test
	void whenLength412AndWidth234ThenResult473Dot81() {
		double length = 412, width = 234;
		double expected = 473.81;
		double output = Rectangle.diagonal(length, width);
		assertThat(output).isEqualTo(expected, withPrecision(0.01));
	}
}