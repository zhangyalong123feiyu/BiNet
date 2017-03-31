package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class CommentAddData implements Serializable {

	private String user_id, user_name, head_img_url, type, content, relative_id, create_time, update_time, status;
	private long comment_id;

	@Override
	public String toString() {
		return "CommentAddData [user_id=" + user_id + ", user_name=" + user_name + ", head_img_url=" + head_img_url + ", type=" + type + ", content=" + content + ", relative_id=" + relative_id + ", create_time=" + create_time + ", update_time=" + update_time + ", status=" + status + ", comment_id=" + comment_id + "]";
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getHead_img_url() {
		return head_img_url;
	}

	public void setHead_img_url(String head_img_url) {
		this.head_img_url = head_img_url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRelative_id() {
		return relative_id;
	}

	public void setRelative_id(String relative_id) {
		this.relative_id = relative_id;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getComment_id() {
		return comment_id;
	}

	public void setComment_id(long comment_id) {
		this.comment_id = comment_id;
	}

}
