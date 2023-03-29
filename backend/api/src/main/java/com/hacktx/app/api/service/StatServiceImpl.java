package com.hacktx.app.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hacktx.app.api.message.FetchMarketValueResponse;
import com.hacktx.app.api.message.FetchRankingResponse;
import com.hacktx.app.api.message.FetchStatResponse;
import com.hacktx.app.api.message.MarketValueResponse;
import com.hacktx.app.api.message.RankingResponse;
import com.hacktx.app.api.message.UserStat;
import com.hacktx.app.api.model.County;
import com.hacktx.app.api.repository.CountyRepository;

@Service
public class StatServiceImpl implements StatService {
	@Autowired
	CountyRepository repo;

	@Override
	public FetchStatResponse getStats(String county_name) {
		FetchStatResponse response = new FetchStatResponse();
		List<County> list = repo.findByCounty(county_name);
		List<UserStat> us = new ArrayList<>();
		for (County county : list) {
			UserStat u = new UserStat();
			u.setCounty(county.getCounty());
			u.setCrop(county.getCrops());
			u.setAcre(county.getAcres());
			u.setId(county.getId());
			us.add(u);

		}
		response.setUserData(us);
		return response;
	}

	@Override
	public FetchMarketValueResponse getMarketValue(String county_name) {
		FetchMarketValueResponse response = new FetchMarketValueResponse();
		List<County> list = repo.findMarketValueByCounty(county_name);
		List<MarketValueResponse> us = new ArrayList<>();
		for (County county : list) {
			MarketValueResponse u = new MarketValueResponse();
			u.setCounty(county.getCounty());
			u.setCrop(county.getCrops());
			u.setSales(county.getSales());
			us.add(u);
		}
		response.setMarketValue(us);
		return response;
	}

	@Override
	public FetchRankingResponse geRankingValue(String county_name) {
		FetchRankingResponse response = new FetchRankingResponse();
		List<County> list = repo.findRankingByCounty(county_name);
		List<RankingResponse> us = new ArrayList<>();
		for (County county : list) {
			RankingResponse u = new RankingResponse();
			u.setCounty(county.getCounty());
			u.setCrops(county.getCrops());
			u.setRankInState(county.getRankInState());
			u.setRankInUs(county.getRankInUs());
			u.setId(county.getId());
			us.add(u);
		}
		response.setResponse(us);
		return response;
	}

}
