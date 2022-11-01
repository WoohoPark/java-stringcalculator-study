package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TextBoxTest {

	@Test
	@DisplayName("빈문자열을 확인한다.")
	public void Given_EmptyValue_When_isEmptyOrNull_Then_True(){
		String actual = "";

		TextBox textBox = new TextBox(actual);

		assertThat(textBox.isEmptyValue()).isTrue();
	}

	@Test
	@DisplayName("커스텀문자열을 포함하는지 확인한다.")
	public void Given_CustomValue_When_isCustomSeparator_Then_True(){
		String actual  = "//;\n1;2;3";

		TextBox textBox = new TextBox(actual);

		assertThat(textBox.isCustomContainValue()).isTrue();
	}

}
