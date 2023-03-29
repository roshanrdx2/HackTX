package com.hacktx.app.api.service;

import com.hacktx.app.api.message.BaseResponse;
import com.hacktx.app.api.message.GetQuoteResponse;
import com.hacktx.app.api.message.GetUserNameResponse;
import com.hacktx.app.api.message.LoginCredentials;
import com.hacktx.app.api.message.RegisterUserRequest;
import com.hacktx.app.api.message.UserDetails;

public interface UserService {
	public BaseResponse addUser(RegisterUserRequest newUser);

	public GetQuoteResponse getQuote(UserDetails details);

	public GetUserNameResponse getUsername(LoginCredentials credentials);
}
