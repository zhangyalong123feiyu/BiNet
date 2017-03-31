package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class EntryResultChildren implements Serializable {

	private int sex, classId;
	private String name, id;
	private EntryResultChildrenClazz clazz;
	private EntryResultChildrenSchool school;
	private EntryResultChildrenCamera camera;

	@Override
	public String toString() {
		return "EntryResultChildren [name=" + name + ", sex=" + sex + ", id=" + id + ", classId=" + classId + ", clazz=" + clazz + ", school=" + school + ", camera=" + camera + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public EntryResultChildrenClazz getClazz() {
		return clazz;
	}

	public void setClazz(EntryResultChildrenClazz clazz) {
		this.clazz = clazz;
	}

	public EntryResultChildrenSchool getSchool() {
		return school;
	}

	public void setSchool(EntryResultChildrenSchool school) {
		this.school = school;
	}

	public EntryResultChildrenCamera getCamera() {
		return camera;
	}

	public void setCamera(EntryResultChildrenCamera camera) {
		this.camera = camera;
	}

}
