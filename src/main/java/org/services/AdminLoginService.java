package org.services;

import org.model.LoginModel;
import org.repository.AdminLoginRepository;

public class AdminLoginService {
	AdminLoginRepository adRepo=new AdminLoginRepository();
	
public boolean isAdminLogin(LoginModel model)
{
	return adRepo.isAdminLogin(model);
}
}
