package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

	@Test
	void whenStartMoreThenFinishThen0() {
		int start = 7, finish = 4;
		int expect = 0;
		int output = Counter.sum(start, finish);
		assertThat(output).isEqualTo(expect);
	}

	@Test
	void whenStartMinus3AndFinish4Then4() {
		int start = -3, finish = 4;
		int expect = 4;
		int output = Counter.sum(start, finish);
		assertThat(output).isEqualTo(expect);
	}

	@Test
	void whenStart3AndFinish7Then25() {
		int start = 3, finish = 7;
		int expect = 25;
		int output = Counter.sum(start, finish);
		assertThat(output).isEqualTo(expect);
	}

	@Test
	void whenStartMinus3AndFinishMinus7Then25() {
		int start = 3, finish = 7;
		int expect = 25;
		int output = Counter.sum(start, finish);
		assertThat(output).isEqualTo(expect);
	}
}