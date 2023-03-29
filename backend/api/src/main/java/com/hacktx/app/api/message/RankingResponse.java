package com.hacktx.app.api.message;

public class RankingResponse {

	private Long id;
	private String county;
	private String Crops;
	private Integer rankInState;
	private Integer rankInUs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCrops() {
		return Crops;
	}

	public void setCrops(String crops) {
		Crops = crops;
	}

	@Override
	public String toString() {
		return "RankingResponse [id=" + id + ", county=" + county + ", Crops=" + Crops + ", rankInState=" + rankInState
				+ ", rankInUs=" + rankInUs + "]";
	}

}
