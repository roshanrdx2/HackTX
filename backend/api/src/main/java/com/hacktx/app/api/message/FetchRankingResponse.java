package com.hacktx.app.api.message;

import java.util.List;

public class FetchRankingResponse {

	List<RankingResponse> response;

	public List<RankingResponse> getResponse() {
		return response;
	}

	public void setResponse(List<RankingResponse> response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "FetchRankingResponse [response=" + response + "]";
	}

}
