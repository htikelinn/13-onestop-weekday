package com.jdc.mkt.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@TestMethodOrder(OrderAnnotation.class)
public  class JpaFactory {

	static EntityManagerFactory emf;
	EntityManager em;

	@BeforeEach
	void createEm() {
		em = emf.createEntityManager();
	}

	@AfterEach
	void closeEm() {
		if (null != em && em.isOpen())
			em.close();
	}

	@BeforeAll
	static void init() {
		emf = Persistence.createEntityManagerFactory("entitymanager");
	}

	@AfterAll
	static void closeEmf() {
		if (null != emf && emf.isOpen())
			emf.close();
	}

}
