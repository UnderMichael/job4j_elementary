package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
	@Test
	public void whenSort5Numbers() {
		int[] data = new int[]{3, 4, 1, 2, 5};
		int[] result = SortSelected.sort(data);
		int[] expected = new int[]{1, 2, 3, 4, 5};
		assertThat(result).containsExactly(expected);
	}

	@Test
	public void whenSort3Numbers() {
		int[] data = new int[]{3, 1, 5};
		int[] result = SortSelected.sort(data);
		int[] expected = new int[]{1, 3, 5};
		assertThat(result).containsExactly(expected);
	}

	@Test
	public void whenSort10Numbers() {
		int[] data = new int[]{7, 2, 8, 5, 6, 0, 9, 4, 3, 1};
		int[] result = SortSelected.sort(data);
		int[] expected = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		assertThat(result).containsExactly(expected);
	}
}