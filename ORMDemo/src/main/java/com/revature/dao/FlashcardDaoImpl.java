package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.beans.Flashcard;
import com.revature.util.ConnectionUtil;

public class FlashcardDaoImpl implements FlashcardDao {
	
	private SessionFactory sf = ConnectionUtil.getSessionFactory();

	@Override
	public List<Flashcard> getAllFlashcards() {
		List<Flashcard> flashcards = new ArrayList<>();
		try(Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			flashcards = s.createQuery("from Flashcard").getResultList(); //HQL
			tx.commit();
		}
		return flashcards;
	}

	@Override
	public Flashcard getFlashcardById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFlashcard(Flashcard f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateFlashcard(Flashcard f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFlashcard(Flashcard f) {
		// TODO Auto-generated method stub
		
	}

}
