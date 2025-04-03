package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

	@Test
	void whenMan175Then86dot25() {
		short input = 175;
		double expected = 86.25;
		double output = Fit.manWeight(input);
		assertThat(output).isEqualTo(expected, withPrecision(0.01));
	}

	@Test
	void whenWoman164Then62dot1() {
		short input = 164;
		double expected = 62.1;
		double output = Fit.womanWeight(input);
		assertThat(output).isEqualTo(expected, withPrecision(0.01));
	}
}