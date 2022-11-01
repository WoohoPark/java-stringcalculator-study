package service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomCalculatorTest {

	@Test
	public void Given_CustomValue_When_Calculator_Then_Six(){
		String actual = "//;\n1;2;3";
		int expect = 6;

		StringCalculator stringCalculator = new CustomCalculator();

		assertThat(stringCalculator.calculator(actual)).isEqualTo(expect);
	}
}
