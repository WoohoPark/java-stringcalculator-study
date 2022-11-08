import java.util.Arrays;

public class StringAddCalculator {
	private static final TokenDecomposition tokenDecomposition = new TokenDecomposition();
	private static final int InitCount = 0;
	public static int splitAndSum(String token) {

		TokenVerification tokenVerification = new TokenVerification(token);

		if(tokenVerification.isEmptyOrNull()){
			return 0;
		}

		if(tokenVerification.isLenghtEqualOne()){
			return TokenUtils.validationToNumber(token);
		}

		String[] tokens = tokenDecomposition.split(tokenVerification.getToken());

		return Arrays.stream(tokens)
				.map(TokenUtils::validationToNumber)
				.reduce(InitCount, Integer::sum);
	}

}
