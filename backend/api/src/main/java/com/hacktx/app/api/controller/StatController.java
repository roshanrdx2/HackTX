package com.hacktx.app.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hacktx.app.api.message.FetchMarketValueResponse;
import com.hacktx.app.api.message.FetchRankingResponse;
import com.hacktx.app.api.message.FetchStatResponse;
import com.hacktx.app.api.service.StatService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StatController {

	@Autowired
	StatService service;

	@GetMapping("/getStats/{county_name}")
	public ResponseEntity<FetchStatResponse> fetchStats(@PathVariable String county_name) {
		FetchStatResponse response = service.getStats(county_name);
		return ResponseEntity.ok(response);
	}

	@GetMapping("/getMarketValue/{county_name}")
	public ResponseEntity<FetchMarketValueResponse> fetchMarketValue(@PathVariable String county_name) {
		FetchMarketValueResponse response = service.getMarketValue(county_name);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/getRanking/{county_name}")
	public ResponseEntity<FetchRankingResponse> fetchRanking(@PathVariable String county_name) {
		FetchRankingResponse response = service.geRankingValue(county_name);
		return ResponseEntity.ok(response);
	}

}
