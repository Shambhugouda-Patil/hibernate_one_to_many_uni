package com.ty.one.to.many.uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetMobileSims {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Mobile mobile=entityManager.find(Mobile.class, 10);
		if(mobile != null)
		{

			System.out.println("================");
			System.out.println("Mobile name is :"+mobile.getName());
			System.out.println("Mobile cost is :"+mobile.getCost());
			System.out.println("================");
			
			List<Sim> sims=mobile.getList();
			
			for(Sim sim: sims) {
				System.out.println("sim id :"+sim.getId());
				System.out.println("sim provider:"+sim.getProvider());
				System.out.println("sim type:"+sim.getType());
				System.out.println("=========");
			}
		}
		else
		{
				System.out.println("No data is found");
		}
	}

	}
