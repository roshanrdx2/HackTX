package com.hacktx.app.api.message;

import java.util.List;

public class FetchStatResponse {
	
	List<UserStat> UserData;

	public List<UserStat> getUserData() {
		return UserData;
	}

	public void setUserData(List<UserStat> userData) {
		UserData = userData;
	}
}
