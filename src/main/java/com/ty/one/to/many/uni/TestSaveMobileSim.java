package com.ty.one.to.many.uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveMobileSim {
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Mobile mobile=new Mobile();
		mobile.setName("samsung");
		mobile.setCost(30000);
		
		Sim sim1=new Sim();
		sim1.setProvider("vodafone");
		sim1.setType("4g");
		
		Sim sim2=new Sim();
		sim2.setProvider("reliance");
		sim2.setType("3g");
		
		List<Sim> sims=new ArrayList<Sim>();
		sims.add(sim1);
		sims.add(sim2);
		
		mobile.setList(sims);
		
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityTransaction.commit();
		
		
		
		
		
   }

}
