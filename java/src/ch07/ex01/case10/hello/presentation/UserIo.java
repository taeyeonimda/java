package ch07.ex01.case10.hello.presentation;

import ch07.ex01.case10.hello.service.UserService;

public class UserIo {
	private UserService userService;
	
	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void say() {
		System.out.println(userService.greet());
	}
}
