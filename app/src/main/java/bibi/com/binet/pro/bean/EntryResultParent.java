package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class EntryResultParent implements Serializable {

	private int sex;
	private String id, phoneNo, cardNo, name, address, emai, emerNo, signature;
	private String headImg; // isNull?

	@Override
	public String toString() {
		return "EntryResultParent [id=" + id + ", phoneNo=" + phoneNo + ", cardNo=" + cardNo + ", name=" + name + ", sex=" + sex + ", address=" + address + ", emai=" + emai + ", emerNo=" + emerNo + ", signature=" + signature + ", headImg=" + headImg + "]";
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmai() {
		return emai;
	}

	public void setEmai(String emai) {
		this.emai = emai;
	}

	public String getEmerNo() {
		return emerNo;
	}

	public void setEmerNo(String emerNo) {
		this.emerNo = emerNo;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

}
