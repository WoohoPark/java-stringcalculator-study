package service;

import utils.NumberFormatUtils;

import java.util.Arrays;

public class DefaultCalculator implements StringCalculator{

	private static final String defaultSeparator = "[,:]";

	@Override
	public int calculator(String text) {
		String[] texts = text.split(defaultSeparator);

		return Arrays.stream(texts)
				.map(NumberFormatUtils::validation)
				.reduce(0, Integer::sum);
	}
}
