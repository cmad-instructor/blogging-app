package com.glarimy.cmad.essentials.staging.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.glarimy.cmad.essentials.staging.api.Book;

public class JpaDAO implements DAO {
	private EntityManager em = Persistence.createEntityManagerFactory("lib").createEntityManager();

	@Override
	public Book read(int pk) {
		System.out.println("DAO is finding " + pk);
		return em.find(Book.class, pk);
	}
}