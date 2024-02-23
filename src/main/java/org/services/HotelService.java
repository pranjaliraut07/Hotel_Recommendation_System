package org.services;

import java.util.List;

import org.model.HotelInfoModel;
import org.model.HotelModel;
import org.repository.HotelRepository;

public class HotelService {
	HotelRepository hotelRepo=new HotelRepository();
public boolean isAddHotel(HotelModel model)
{
	return hotelRepo.isAddHotel(model);
}
public List<HotelModel>getAllHotels(){
	return hotelRepo.getAllHotels();
}
public boolean isDeleteHotel(int hotelid) {
	return hotelRepo.isDeleteHotel(hotelid);
}
public boolean isUpdateHotel(HotelModel model) {
	return hotelRepo.isHotelUpdate(model);
}
public boolean isAddHotelInfo(HotelInfoModel model)
{
	return hotelRepo.isAddHotelInfo(model);
}
public List<HotelInfoModel>getHotelList()
{
return hotelRepo.getHotelInfo();	
}
}
