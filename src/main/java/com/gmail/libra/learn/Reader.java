package com.gmail.libra.learn;

import java.io.Serializable;

import javax.batch.api.chunk.AbstractItemReader;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Reader extends AbstractItemReader {
	private EntityManager manager;
	private EntityManagerFactory factory;

	@Override
	public void open(Serializable checkpoint) throws Exception {
		factory = Persistence.createEntityManagerFactory("pu");
		manager = factory.createEntityManager();
	}

	@Override
	public Object readItem() throws Exception {
		return null;
	}

	@Override
	public void close() throws Exception {
		manager.close();
		factory.close();
	}
}
