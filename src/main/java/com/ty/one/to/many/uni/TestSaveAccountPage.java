package com.ty.one.to.many.uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveAccountPage {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Account account=new Account();
		account.setName("savitri");
		account.setEmail("savu@gmail");
		account.setMobile(1729301716);
		account.setPassword("savu@123");
		
		List<Page> list=new ArrayList<Page>();
		
		Page page1=new Page();
		page1.setName("facebook");
		page1.setTitle("she is like a star");
		page1.setDescription("Hii good night");
		
		Page page2=new Page();
		page2.setName("instagram");
		page2.setTitle("moon");
		page2.setDescription("Hii good evening");
		
		list.add(page1);
		list.add(page2);
		
		account.setPage(list);
		
		entityTransaction.begin();
		entityManager.persist(account);
		entityManager.persist(page1);
		entityManager.persist(page2);
		entityTransaction.commit();
		
		
	}

}
