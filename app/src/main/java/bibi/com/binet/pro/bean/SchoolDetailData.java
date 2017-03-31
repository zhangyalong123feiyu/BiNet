package bibi.com.binet.pro.bean;

import java.io.Serializable;

public class SchoolDetailData implements Serializable {

	private int id;
	private String name, idea, description, estaTime, address, telephone;
	private SchoolPosterUrl posterUrl;

	@Override
	public String toString() {
		return "SchoolDetailData [id=" + id + ", name=" + name + ", idea=" + idea + ", description=" + description
				+ ", estaTime=" + estaTime + ", address=" + address + ", telephone=" + telephone + ", posterUrl="
				+ posterUrl + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEstaTime() {
		return estaTime;
	}

	public void setEstaTime(String estaTime) {
		this.estaTime = estaTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public SchoolPosterUrl getPosterUrl() {
		return posterUrl;
	}

	public void setPosterUrl(SchoolPosterUrl posterUrl) {
		this.posterUrl = posterUrl;
	}
}
