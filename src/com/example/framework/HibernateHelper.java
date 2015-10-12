package com.example.framework;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.GroupData;
import com.example.tests.ContactData;
import com.example.utils.SortedListOf;

public class HibernateHelper extends HelperBase {

	public HibernateHelper(ApplicationManager manager) {
	  super(manager);
	}

	 public List<GroupData> listGroups() {
	 	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	 	Transaction trans = session.beginTransaction();
	 	try {
	         return (List<GroupData>) session.createQuery("from GroupData").list();
	 	} finally {
	         trans.commit();
	 	}
	 }
	 	

	public List<ContactData> listContacts() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction trans = session.beginTransaction();
		try {
          return (List<ContactData>) session.createQuery("from ContactData").list();
		} finally {
          trans.commit();
		}
	}
	
}
