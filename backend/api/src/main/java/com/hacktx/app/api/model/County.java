package com.hacktx.app.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "county")
public class County {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String state;

	private String county;

	private String crops;
	private String acres;
	private String sales;

	@Column(name = "rank_in_state")
	private Integer rankInState;

	@Column(name = "rank_in_us")
	private Integer rankInUs;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCrops() {
		return crops;
	}

	public void setCrops(String crops) {
		this.crops = crops;
	}

	public String getAcres() {
		return acres;
	}

	public void setAcres(String acres) {
		this.acres = acres;
	}

	public String getSales() {
		return sales;
	}

	public void setSales(String sales) {
		this.sales = sales;
	}

	public Integer getRankInState() {
		return rankInState;
	}

	public void setRankInState(Integer rankInState) {
		this.rankInState = rankInState;
	}

	
	public Integer getRankInUs() {
		return rankInUs;
	}

	public void setRankInUs(Integer rankInUs) {
		this.rankInUs = rankInUs;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", state=" + state + ", county=" + county + ", crops=" + crops + ", acres=" + acres
				+ ", sales=" + sales + ", rankInState=" + rankInState + ", rankInUs=" + rankInUs + "]";
	}
}