package service;

import utils.NumberFormatUtils;

public class OneLengthCalculator implements StringCalculator {

	@Override
	public int calculator(String text) {
		return NumberFormatUtils.validation(text);
	}
}
