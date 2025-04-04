package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrimeNumberTest {
	@Test
	void when10Then4() {
		int finish = 10;
		int result = PrimeNumber.calc(finish);
		int expected = 4;
		assertThat(result).isEqualTo(expected);
	}

	@Test
	void when1Then0() {
		int finish = 1;
		int result = PrimeNumber.calc(finish);
		int expected = 0;
		assertThat(result).isEqualTo(expected);
	}

	@Test
	void when3Then2() {
		int finish = 3;
		int result = PrimeNumber.calc(finish);
		int expected = 2;
		assertThat(result).isEqualTo(expected);
	}

	@Test
	void when30Then10() {
		int finish = 30;
		int result = PrimeNumber.calc(finish);
		int expected = 10;
		assertThat(result).isEqualTo(expected);
	}

	@Test
	void when100Then25() {
		int finish = 100;
		int result = PrimeNumber.calc(finish);
		int expected = 25;
		assertThat(result).isEqualTo(expected);
	}
}