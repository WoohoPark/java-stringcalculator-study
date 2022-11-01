package service;

import utils.NumberFormatUtils;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomCalculator implements StringCalculator{

	private static final String CustomDelimiterPattern = "//(.)\n(.*)";
	private static final int CustomDelimiterIndex = 1;
	private static final int TextsIndex = 2;

	@Override
	public int calculator(String text) {
		int sum = 0;

		Matcher m = Pattern.compile(CustomDelimiterPattern).matcher(text);

		if (m.find()) {
			String customDelimiter = m.group(CustomDelimiterIndex);
			String[] texts= m.group(TextsIndex).split(customDelimiter);
			sum= Arrays.stream(texts)
					.map(NumberFormatUtils::validation)
					.reduce(0, Integer::sum);
		}

		return sum;
	}
}
