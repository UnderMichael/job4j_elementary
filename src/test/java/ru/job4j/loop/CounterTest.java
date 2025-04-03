package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

	@Test
	void whenStartMoreThenFinishThenSum0() {
		int start = 7, finish = 4;
		int expect = 0;
		int output = Counter.sum(start, finish);
		assertThat(output).isEqualTo(expect);
	}

	@Test
	void whenStartMinus3AndFinish4ThenSum4() {
		int start = -3, finish = 4;
		int expect = 4;
		int output = Counter.sum(start, finish);
		assertThat(output).isEqualTo(expect);
	}

	@Test
	void whenStart3AndFinish7ThenSum25() {
		int start = 3, finish = 7;
		int expect = 25;
		int output = Counter.sum(start, finish);
		assertThat(output).isEqualTo(expect);
	}

	@Test
	void whenStartMinus3AndFinishMinus7ThenSum25() {
		int start = 3, finish = 7;
		int expect = 25;
		int output = Counter.sum(start, finish);
		assertThat(output).isEqualTo(expect);
	}

	@Test
	void whenSumEvenNumbersFrom1To10Then30() {
		int start = 1;
		int finish = 10;
		int result = Counter.sumByEven(start, finish);
		int expected = 30;
		assertThat(result).isEqualTo(expected);
	}

	@Test
	void whenSumEvenNumbersFromMinus7To10Then18() {
		int start = -7;
		int finish = 10;
		int result = Counter.sumByEven(start, finish);
		int expected = 18;
		assertThat(result).isEqualTo(expected);
	}

	@Test
	void whenSumEvenNumbersFromMinus7ToMinus10Then18() {
		int start = -7;
		int finish = -10;
		int result = Counter.sumByEven(start, finish);
		int expected = 0;
		assertThat(result).isEqualTo(expected);
	}
}