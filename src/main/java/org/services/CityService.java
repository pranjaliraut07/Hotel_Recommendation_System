package org.services;

import java.util.List;

import org.model.CityModel;
import org.repository.CityRepository;

public class CityService {
	CityRepository cityRepo=new CityRepository();
public boolean isAddCity(CityModel model) 
{
	return cityRepo.isAddCity(model);
}
public List<CityModel> getAllCities()
{
	return cityRepo.getAllCities();
}
}