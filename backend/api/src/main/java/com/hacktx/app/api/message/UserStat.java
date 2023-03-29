package com.hacktx.app.api.message;

public class UserStat {

	private long id;
	private String county;
	private String crop;
	private String Acre;

	public long getId() {
		return id;
	}

	public void setId(long l) {
		this.id = l;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCrop() {
		return crop;
	}

	public void setCrop(String crop) {
		this.crop = crop;
	}

	public String getAcre() {
		return Acre;
	}

	public void setAcre(String acre) {
		Acre = acre;
	}

	@Override
	public String toString() {
		return "UserStat [id=" + id + ", county=" + county + ", crop=" + crop + ", Acre=" + Acre + "]";
	}

}
