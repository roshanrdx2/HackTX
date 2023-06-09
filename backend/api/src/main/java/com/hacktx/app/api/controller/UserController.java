//package com.hacktx.app.api.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.hacktx.app.api.message.BaseResponse;
//import com.hacktx.app.api.message.FetchAgentsResponse;
//import com.hacktx.app.api.message.GetQuoteResponse;
//import com.hacktx.app.api.message.GetUserNameResponse;
//import com.hacktx.app.api.message.LoginCredentials;
//import com.hacktx.app.api.message.RegisterUserRequest;
//import com.hacktx.app.api.message.UserDetails;
//import com.hacktx.app.api.model.Users;
//import com.hacktx.app.api.repository.UsersRepository;
//import com.hacktx.app.api.service.AgentService;
//import com.hacktx.app.api.service.UserService;
//
//@RestController
//@CrossOrigin(origins = "http://127.0.0.1:5501/")
//public class UserController {
//	@Autowired
//	UsersRepository repo;
//
//	@Autowired
//	UserService service;
//
//	@Autowired
//	AgentService agentService;
//
//	@GetMapping("/users")
//	public ResponseEntity<List<Users>> getAllUsers(@RequestParam(required = false) String title) {
//		try {
//			List<Users> tutorials = new ArrayList<Users>();
//
//			if (title == null)
//				repo.findAll().forEach(tutorials::add);
//
//			if (tutorials.isEmpty()) {
//				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//			}
//
//			return new ResponseEntity<>(tutorials, HttpStatus.OK);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//
//	@PostMapping("/addUser")
//	public ResponseEntity<BaseResponse> addUser(@RequestBody RegisterUserRequest newUser) {
//
//		BaseResponse response = service.addUser(newUser);
//		return ResponseEntity.ok(response);
//
//	}
//
//	@GetMapping("/getAgents/{zipcode}")
//	public ResponseEntity<FetchAgentsResponse> fetchAgentsByZipcode(@PathVariable Integer zipcode) {
//		FetchAgentsResponse response = agentService.getAgents(zipcode);
//		return ResponseEntity.ok(response);
//	}
//
//	@PostMapping("/getQuote")
//	public ResponseEntity<GetQuoteResponse> getQuote(@RequestBody UserDetails details) {
//		GetQuoteResponse response = service.getQuote(details);
//		return ResponseEntity.ok(response);
//	}
//
//	@PostMapping("/getUserName")
//	public ResponseEntity<GetUserNameResponse> getUserName(@RequestBody LoginCredentials credentials) {
//		GetUserNameResponse response = service.getUsername(credentials);
//		return ResponseEntity.ok(response);
//	}
//
//}
