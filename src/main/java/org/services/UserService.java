package org.services;

import org.model.LoginModel;
import org.model.RegisterModel;
import org.repository.UserRepository;

public class UserService {
	UserRepository userRepo=new UserRepository();
	public boolean isRegisterUser(RegisterModel model)
	{
		return userRepo.isRegisterUser(model);
		
	}
	public int validateUser(LoginModel model)
	{
		return userRepo.validateUser(model);
	}
	public RegisterModel getUserProfile(int userid)
	{
		return userRepo.getUserProfile(userid);
	}

}
