import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TokenDecomposition {
	private static final String CUSTOM_DELIMITER = "//(.)\n(.*)";
	private static final Pattern CUSTOM_DELIMITER_PATTERN = Pattern.compile(CUSTOM_DELIMITER);
	private static final String DEFAULT_DELIMITER = "[,:]";

	public String[] split(String token){
		Matcher m = CUSTOM_DELIMITER_PATTERN.matcher(token);
		if (m.find()) {
			String customDelimiter = m.group(1);
			return m.group(2).split(customDelimiter);
		}
		return token.split(DEFAULT_DELIMITER);
	}
}
