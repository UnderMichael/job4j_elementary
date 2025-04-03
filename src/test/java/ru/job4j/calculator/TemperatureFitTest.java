package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TemperatureFitTest {

	@Test
	void whenRoomTemperature22ThenMeat17() {
		int input = 22;
		double expected = 17.0;
		double output = TemperatureFit.idealTemperatureForMeat(input);
		assertThat(output).isEqualTo(expected, withPrecision(0.01));
	}

	@Test
	void whenRoomTemperature22ThenFruit17() {
		int input = 22;
		double expected = 20.0;
		double output = TemperatureFit.idealTemperatureForFruits(input);
		assertThat(output).isEqualTo(expected, withPrecision(0.01));

	}
}