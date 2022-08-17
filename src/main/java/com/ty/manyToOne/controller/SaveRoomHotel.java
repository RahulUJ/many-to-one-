package com.ty.manyToOne.controller;

import com.ty.manyToOne.dao.HotelDao;
import com.ty.manyToOne.dao.RoomDao;
import com.ty.manyToOne.dto.Hotel;
import com.ty.manyToOne.dto.Room;

public class SaveRoomHotel {

	public static void main(String[] args) {
		HotelDao hotelDao = new HotelDao();
		Hotel hotel = hotelDao.getHotelById(2);

		Room room1 = new Room();
		room1.setCapacity(2);
		room1.setType("President Suite");
		room1.setHotel(hotel);

		Room room2 = new Room();
		room2.setType("Ac Deluxe Suite");
		room2.setCapacity(6);
		room2.setHotel(hotel);

		RoomDao roomDao = new RoomDao();
		roomDao.saveRoom(room1);
		roomDao.saveRoom(room2);
	}

}
