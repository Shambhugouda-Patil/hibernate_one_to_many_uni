package com.ty.one.to.many.uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetAccountPage {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Account account=entityManager.find(Account.class, 1);
		if(account != null)
		{

			System.out.println("================");
			System.out.println("Account  name is :"+account.getName());
			System.out.println("Account email is"+account.getEmail());
			System.out.println("Account mobile is:"+account.getMobile());
			System.out.println("Account id is:"+account.getId());
			System.out.println("================");
			
			List<Page> pages=account.getPage();		
			for(Page page: pages) {
				System.out.println("page id :"+page.getId());
				System.out.println("page description:"+page.getDescription());
				System.out.println("page name:"+page.getName());
				System.out.println("page title:"+page.getTitle());
			}
		}
		else
		{
				System.out.println("No data is found");
		}

}
}
