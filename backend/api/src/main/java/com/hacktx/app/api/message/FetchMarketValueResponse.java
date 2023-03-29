package com.hacktx.app.api.message;

import java.util.List;

public class FetchMarketValueResponse {

	List<MarketValueResponse> marketValue;

	public List<MarketValueResponse> getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(List<MarketValueResponse> marketValue) {
		this.marketValue = marketValue;
	}

}
