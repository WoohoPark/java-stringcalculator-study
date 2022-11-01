package service;

public class EmptyCalculator implements StringCalculator{

	private static final int emptyValue = 0;

	@Override
	public int calculator(String text) {
		return emptyValue;
	}

}
