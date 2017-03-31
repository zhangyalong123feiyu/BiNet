package bibi.com.binet.pro.bean;

import java.io.Serializable;
import java.util.List;

public class KnowledgeData implements Serializable {

	private boolean hasMore;
	private List<KnowledgeInfo> knowledage;
	private List<AnnoumentInfo> annoument;
	private List<NoticeInfo> notice;
	private String delete;

	@Override
	public String toString() {
		return "KnowledgeData [hasMore=" + hasMore + ", knowledage=" + knowledage + ", annoument=" + annoument
				+ ", notice=" + notice + ", delete=" + delete + "]";
	}

	public boolean isHasMore() {
		return hasMore;
	}

	public void setHasMore(boolean hasMore) {
		this.hasMore = hasMore;
	}

	public List<KnowledgeInfo> getKnowledage() {
		return knowledage;
	}

	public void setKnowledage(List<KnowledgeInfo> knowledage) {
		this.knowledage = knowledage;
	}

	public List<AnnoumentInfo> getAnnoument() {
		return annoument;
	}

	public void setAnnoument(List<AnnoumentInfo> annoument) {
		this.annoument = annoument;
	}

	public List<NoticeInfo> getNotice() {
		return notice;
	}

	public void setNotice(List<NoticeInfo> notice) {
		this.notice = notice;
	}

	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}

}
