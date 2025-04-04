package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CheckPrimeNumberTest {

	@Test
	void when10ThenFalse() {
		int number = 10;
		boolean result = CheckPrimeNumber.check(number);
		assertThat(result).isFalse();
	}

	@Test
	void when17ThenTrue() {
		int number = 17;
		boolean result = CheckPrimeNumber.check(number);
		assertThat(result).isTrue();
	}

	@Test
	void when20ThenFalse() {
		int number = 20;
		boolean result = CheckPrimeNumber.check(number);
		assertThat(result).isFalse();
	}

	@Test
	void when23ThenTrue() {
		int number = 23;
		boolean result = CheckPrimeNumber.check(number);
		assertThat(result).isTrue();
	}

	@Test
	void when0ThenFalse() {
		int number = 0;
		boolean result = CheckPrimeNumber.check(number);
		assertThat(result).isFalse();
	}

	@Test
	void when1ThenFalse() {
		int number = 1;
		boolean result = CheckPrimeNumber.check(number);
		assertThat(result).isFalse();
	}

	@Test
	void when97ThenTrue() {
		int number = 97;
		boolean result = CheckPrimeNumber.check(number);
		assertThat(result).isTrue();
	}
}