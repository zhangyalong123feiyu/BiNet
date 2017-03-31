package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class CommentInfo implements Serializable {

	private String user_id, user_name, head_img_url, type, content, id, relative_id, create_time, update_time, status;

	@Override
	public String toString() {
		return "CommentInfo [user_id=" + user_id + ", user_name=" + user_name + ", head_img_url=" + head_img_url + ", type=" + type + ", content=" + content + ", id=" + id + ", relative_id=" + relative_id + ", create_time=" + create_time + ", update_time=" + update_time + ", status=" + status + "]";
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

}
