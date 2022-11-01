package service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmptyCalculatorTest {

	@Test
	public void Given_EmptyValue_When_Calculator_Then_Zero(){
		String actual = "";
		int expect = 0;

		StringCalculator stringCalculator = new EmptyCalculator();

		assertThat(stringCalculator.calculator(actual)).isEqualTo(expect);
	}
}
