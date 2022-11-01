import model.TextBox;
import service.CalculatorService;

import java.util.Scanner;

public class CalculatorApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		TextBox textBox = new TextBox(sc.next());

		CalculatorService calculatorService = new CalculatorService(textBox.getText(),textBox.getStringCalculator());

		int answer = calculatorService.calculator();

		System.out.println(answer);

	}
}
