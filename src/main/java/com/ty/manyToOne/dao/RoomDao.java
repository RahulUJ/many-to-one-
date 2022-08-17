package com.ty.manyToOne.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manyToOne.dto.Room;

public class RoomDao {
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction transaction = entityManager.getTransaction();

	public void saveRoom(Room room) {
		transaction.begin();
		entityManager.persist(room);
		System.out.println("Rooom Saved");
		transaction.commit();
	}

}
