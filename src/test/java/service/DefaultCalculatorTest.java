package service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DefaultCalculatorTest {

	@Test
	public void Given_DefaultValue_When_Calculator_Then_Six(){
		String actual = "-1,2,3";
		int expect = 6;

		StringCalculator stringCalculator = new DefaultCalculator();

		assertThat(stringCalculator.calculator(actual)).isEqualTo(expect);
	}
}
