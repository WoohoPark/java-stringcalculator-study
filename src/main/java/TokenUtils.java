public class TokenUtils {

	static int validationToNumber(String inputValue) {
		if (Integer.parseInt(inputValue) < 0) {
			throw new RuntimeException("잘못된 값을 입력하였습니다.");
		}
		return Integer.parseInt(inputValue);
	}
}
