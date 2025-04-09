package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static ru.job4j.condition.Max.max;

class MaxTest {
	@Test
	public void when2and5then5() {
		int a = 2;
		int b = 5;
		int expected = 5;
		int output = max(a, b);
		assertThat(output).isEqualTo(expected);
	}

	@Test
	public void when2and5and7then7() {
		int a = 2;
		int b = 5;
		int c = 7;
		int expected = 7;
		int output = max(a, b, c);
		assertThat(output).isEqualTo(expected);
	}

	@Test
	public void whenMinus6and2and5and7then7() {
		int a = -6;
		int b = 2;
		int c = 5;
		int d = 7;
		int expected = 7;
		int output = max(a, b, c, d);
		assertThat(output).isEqualTo(expected);
	}
}