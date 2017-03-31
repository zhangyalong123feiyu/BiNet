package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class StuInfoData implements Serializable {

	private String id, headImgUrl, studentName, clazzName, schoolName, teacherName;
	private String student_no, stu_card_no, birthday, join_time,techerPhone;

	@Override
	public String toString() {
		return "StuInfoData [id=" + id + ", headImgUrl=" + headImgUrl + ", studentName=" + studentName + ", clazzName="
				+ clazzName + ", schoolName=" + schoolName + ", teacherName=" + teacherName + ", student_no="
				+ student_no + ", stu_card_no=" + stu_card_no + ", birthday=" + birthday + ", join_time=" + join_time
				+ ", techerPhone=" + techerPhone + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHeadImgUrl() {
		return headImgUrl;
	}

	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getClazzName() {
		return clazzName;
	}

	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getJoin_time() {
		return join_time;
	}

	public void setJoin_time(String join_time) {
		this.join_time = join_time;
	}

	public String getStudent_no() {
		return student_no;
	}

	public void setStudent_no(String student_no) {
		this.student_no = student_no;
	}

	public String getStu_card_no() {
		return stu_card_no;
	}

	public void setStu_card_no(String stu_card_no) {
		this.stu_card_no = stu_card_no;
	}

	public String getTecherPhone() {
		return techerPhone;
	}

	public void setTecherPhone(String techerPhone) {
		this.techerPhone = techerPhone;
	}

}
