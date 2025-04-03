package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class VectorTest {

	@Test
	void whenVectors13And24ThenResult46() {
		int x1 = 1, y1 = 2, x2 = 3, y2 = 4;
		String expected = "(4, 6)";
		String output = Vector.addVectors(x1, y1, x2, y2);
		assertThat(output).isEqualTo(expected);
	}

	@Test
	void whenVectorsMinus22And3Minus4ThenResult0Minus1() {
		int x1 = -2, y1 = 3, x2 = 2, y2 = -4;
		String expected = "(0, -1)";
		String output = Vector.addVectors(x1, y1, x2, y2);
		assertThat(output).isEqualTo(expected);
	}

	@Test
	void whenVectors2Minus2AndMinus3Minus4ThenResult0Minus7() {
		int x1 = 2, y1 = -3, x2 = -2, y2 = -4;
		String expected = "(0, -7)";
		String output = Vector.addVectors(x1, y1, x2, y2);
		assertThat(output).isEqualTo(expected);
	}

	@Test
	void whenVectorsMinus7Minus3AndMinus2Minus3ThenResultMinus10Minus7() {
		int x1 = -7, y1 = -2, x2 = -3, y2 = -3;
		String expected = "(-10, -5)";
		String output = Vector.addVectors(x1, y1, x2, y2);
		assertThat(output).isEqualTo(expected);
	}
}