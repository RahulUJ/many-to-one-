package com.ty.manyToOne.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manyToOne.dto.Hotel;

public class HotelDao {

	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction transaction = entityManager.getTransaction();
	
	public void saveHotel(Hotel hotel) {
		transaction.begin();
		entityManager.persist(hotel);
		System.out.println("Hotel Saved");
		transaction.commit();
	}
	
	public Hotel getHotelById(int id) {
		return entityManager.find(Hotel.class, id);
	}

}
