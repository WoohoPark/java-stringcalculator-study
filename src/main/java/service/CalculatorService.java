package service;

public class CalculatorService {
	String text;
	StringCalculator stringCalculator;

	public CalculatorService(String text,StringCalculator stringCalculator){
		this.text = text;
		this.stringCalculator=stringCalculator;
	}

	public int calculator(){
		return stringCalculator.calculator(text);
	}
}