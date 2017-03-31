package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class CommentBean implements Serializable {

	String userid, commentid, relativeid, who, time, content, img_url;

	public CommentBean() {
		// TODO Auto-generated constructor stub
	}

	public CommentBean(String userid, String commentid, String relativeid, String who, String time, String content) {
		this.userid = userid;
		this.commentid = commentid;
		this.relativeid = relativeid;
		this.who = who;
		this.time = time;
		this.content = content;
	}

	public CommentBean(String userid, String commentid, String relativeid, String who, String time, String content, String img_url) {
		this.userid = userid;
		this.commentid = commentid;
		this.relativeid = relativeid;
		this.who = who;
		this.time = time;
		this.content = content;
		this.img_url = img_url;
	}

	@Override
	public String toString() {
		return "CommentBean [userid=" + userid + ", commentid=" + commentid + ", relativeid=" + relativeid + ", who=" + who + ", time=" + time + ", content=" + content + ", img_url=" + img_url + "]";
	}

	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getCommentid() {
		return commentid;
	}

	public void setCommentid(String commentid) {
		this.commentid = commentid;
	}

	public String getRelativeid() {
		return relativeid;
	}

	public void setRelativeid(String relativeid) {
		this.relativeid = relativeid;
	}

}
