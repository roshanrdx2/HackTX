package com.hacktx.app.api.service;

import com.hacktx.app.api.message.FetchMarketValueResponse;
import com.hacktx.app.api.message.FetchRankingResponse;
import com.hacktx.app.api.message.FetchStatResponse;

public interface StatService {

	FetchStatResponse getStats(String county_name);

	FetchMarketValueResponse getMarketValue(String county_name);

	FetchRankingResponse geRankingValue(String county_name);

}
