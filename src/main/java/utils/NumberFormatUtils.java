package utils;

public class NumberFormatUtils {

	public static int validation(String value){
		if(Integer.parseInt(value) < 0){
			throw new RuntimeException("음수는 입력할 수 없습니다.");
		}
		return Integer.parseInt(value);
	}
}
