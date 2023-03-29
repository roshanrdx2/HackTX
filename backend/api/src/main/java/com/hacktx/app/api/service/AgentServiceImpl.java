package com.hacktx.app.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hacktx.app.api.message.FetchAgentsResponse;
import com.hacktx.app.api.model.Agents;
import com.hacktx.app.api.repository.AgentRepository;

@Service
public class AgentServiceImpl implements AgentService {
	@Autowired
	AgentRepository repo;

	public FetchAgentsResponse getAgents(Integer zipcode) {
		FetchAgentsResponse response = new FetchAgentsResponse();
		List<Agents> list = repo.findByZipcode(zipcode);
		response.setList(list);
		response.setResultcode(0);
		response.setResultDescription("Success");
		return response;

	}
}
