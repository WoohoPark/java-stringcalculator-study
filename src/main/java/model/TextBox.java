package model;

import service.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextBox {
	private static final String CustomDelimiterPattern = "//(.)\n(.*)";
	private String text;
	private StringCalculator stringCalculator;

	public TextBox(String text) {
		this.text = text;
		setCalculatorStrategy();
	}

	public boolean isEmptyValue() {
		return text == null || text.isEmpty();
	}

	public boolean isCustomContainValue(){
		Matcher m = Pattern.compile(CustomDelimiterPattern).matcher(text);
		if (m.find()) {
			return true;
		}
		return false;
	}

	public boolean isNumberLengthEqualOne(){
		return text.length() == 1;
	}
	public void setCalculatorStrategy(){
		if(isCustomContainValue()){
			stringCalculator = new CustomCalculator();
			return;
		}

		if(isEmptyValue()){
			stringCalculator = new EmptyCalculator();
			return;
		}

		if(isNumberLengthEqualOne()){
			stringCalculator = new OneLengthCalculator();
			return;
		}
		stringCalculator = new DefaultCalculator();
	}

	public String getText() {
		return text;
	}

	public StringCalculator getStringCalculator() {
		return stringCalculator;
	}

}
