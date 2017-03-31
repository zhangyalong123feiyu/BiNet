package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class HeadResult implements Serializable {

	private int code;
	private String msg, accessToken;

	@Override
	public String toString() {
		return "HeadResult [code=" + code + ", msg=" + msg + ", accessToken=" + accessToken + "]";
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

}
