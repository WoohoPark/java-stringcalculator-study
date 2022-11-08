public class TokenVerification {
	String token;

	public TokenVerification(String token){
		this.token = token;
	}

	public boolean isEmptyOrNull(){
		return this.token == null || this.token.isEmpty();
	}

	public boolean isLenghtEqualOne(){
		return this.token.length() == 1;
	}

	public String getToken() {
		return token;
	}
}