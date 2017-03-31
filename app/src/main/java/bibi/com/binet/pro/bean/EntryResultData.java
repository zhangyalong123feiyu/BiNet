package bibi.com.binet.pro.bean;

import java.io.Serializable;
import java.util.List;

public class EntryResultData implements Serializable {

	EntryResultParent parent;
	List<EntryResultChildren> children;
	String userToken;

	@Override
	public String toString() {
		return "EntryResultData [parent=" + parent + ", children=" + children + ", userToken=" + userToken + "]";
	}

	public EntryResultParent getParent() {
		return parent;
	}

	public void setParent(EntryResultParent parent) {
		this.parent = parent;
	}

	public List<EntryResultChildren> getChildren() {
		return children;
	}

	public void setChildren(List<EntryResultChildren> children) {
		this.children = children;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

}
