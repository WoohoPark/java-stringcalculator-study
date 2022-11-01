package service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OneLengthCalculatorTest {

	@Test
	public void Given_NumberLengthOneValue_When_Calculator_Then_Six(){
		String actual = "6";
		int expect = 6;

		StringCalculator stringCalculator = new OneLengthCalculator();

		assertThat(stringCalculator.calculator(actual)).isEqualTo(expect);
	}
}
