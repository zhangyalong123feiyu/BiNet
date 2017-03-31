package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class EzvizData implements Serializable {

	private String accesssToken;

	@Override
	public String toString() {
		return "EzvizData [accesssToken=" + accesssToken + "]";
	}

	public String getAccesssToken() {
		return accesssToken;
	}

	public void setAccesssToken(String accesssToken) {
		this.accesssToken = accesssToken;
	}
	
}
