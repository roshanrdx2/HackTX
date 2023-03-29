package com.hacktx.app.api.service;

import com.hacktx.app.api.message.FetchAgentsResponse;

public interface AgentService {
	public FetchAgentsResponse getAgents(Integer zipcode);
}
