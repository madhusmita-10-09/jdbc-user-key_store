package com.ty.user.keystore.contoller;

import com.ty.user.keystore.dto.User;
import com.ty.user.keystore.service.UserService;

public class TestSaveUser {
	public static void main(String[] args) {
		UserService userService=new UserService();
		User user=new User();
		user.setUid(3);
		user.setUser_name("sundeep");
		user.setEmail("sundeep@mail.com");
		user.setPassword("sundeep@1414");
		
		int res=userService.saveUser(user);
		if(res>0) 
			System.out.println("User saved");
			else
			System.out.println("Not Saved");
	}
}
