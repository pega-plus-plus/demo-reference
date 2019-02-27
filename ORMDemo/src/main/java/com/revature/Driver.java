package com.revature;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.beans.Category;
import com.revature.beans.Flashcard;
import com.revature.dao.FlashcardDao;
import com.revature.dao.FlashcardDaoImpl;

public class Driver {

	public static void main(String[] args) {
		
		//SessionFactory sf = ConnectionUtil.getSessionFactory();
		FlashcardDao fd = new FlashcardDaoImpl();
		System.out.println(fd.getAllFlashcards());
	}
	
	static void initCategories(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		System.out.println(s.save(new Category("coding")));
		System.out.println(s.save(new Category("trivia")));
		tx.commit();
		s.close();
	}
	
	static void initCards(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Category c1 = s.get(Category.class, 2);
		s.save(new Flashcard("What is the answer to life, the universe, and everything?","42",c1));
		tx.commit();
		s.close();
	}

}
