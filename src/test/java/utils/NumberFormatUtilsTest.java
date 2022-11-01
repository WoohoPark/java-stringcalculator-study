package utils;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NumberFormatUtilsTest {

	@Test
	public void Given_MinusNumber_When_ValidationCheck_Then_Exception(){
		assertThatThrownBy(() -> NumberFormatUtils.validation("-1")).isInstanceOf(RuntimeException.class);
	}
}
