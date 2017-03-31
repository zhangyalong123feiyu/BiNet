package bibi.com.binet.pro.bean;

import java.io.Serializable;
import java.util.List;

public class RecipeItem implements Serializable {

	private String context;
	private List<String> images;

	public RecipeItem() {
		// TODO Auto-generated constructor stub
	}

	public RecipeItem(String context, List<String> images) {
		this.context = context;
		this.images = images;
	}

	@Override
	public String toString() {
		return "RecipeItem [context=" + context + ", images=" + images + "]";
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

}
