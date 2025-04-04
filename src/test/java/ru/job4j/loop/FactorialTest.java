package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FactorialTest {

	@Test
	void whenCalculateFactorialFor8Then40320() {
		int number = 8;
		int expected = 40320;
		int output = Factorial.calculate(number);
		assertThat(output).isEqualTo(expected);
	}

	@Test
	void whenCalculateFactorialFor0Then1() {
		int number = 0;
		int expected = 1;
		int output = Factorial.calculate(number);
		assertThat(output).isEqualTo(expected);
	}
}