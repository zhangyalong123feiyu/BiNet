package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class EntryResultChildrenCamera implements Serializable {

	private String cameraId, deviceSerial, cameraNo, cameraName, deviceId, picUrl, defence, isShared, isEncrypt;

	@Override
	public String toString() {
		return "EntryResultChildrenCamera [cameraId=" + cameraId + ", deviceSerial=" + deviceSerial + ", cameraNo="
				+ cameraNo + ", cameraName=" + cameraName + ", deviceId=" + deviceId + ", picUrl=" + picUrl
				+ ", defence=" + defence + ", isShared=" + isShared + ", isEncrypt=" + isEncrypt + "]";
	}

	public String getCameraId() {
		return cameraId;
	}

	public void setCameraId(String cameraId) {
		this.cameraId = cameraId;
	}

	public String getDeviceSerial() {
		return deviceSerial;
	}

	public void setDeviceSerial(String deviceSerial) {
		this.deviceSerial = deviceSerial;
	}

	public String getCameraNo() {
		return cameraNo;
	}

	public void setCameraNo(String cameraNo) {
		this.cameraNo = cameraNo;
	}

	public String getCameraName() {
		return cameraName;
	}

	public void setCameraName(String cameraName) {
		this.cameraName = cameraName;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getDefence() {
		return defence;
	}

	public void setDefence(String defence) {
		this.defence = defence;
	}

	public String getIsShared() {
		return isShared;
	}

	public void setIsShared(String isShared) {
		this.isShared = isShared;
	}

	public String getIsEncrypt() {
		return isEncrypt;
	}

	public void setIsEncrypt(String isEncrypt) {
		this.isEncrypt = isEncrypt;
	}

}
