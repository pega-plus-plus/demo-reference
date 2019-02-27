package com.revature.dao;

import java.util.List;

import com.revature.beans.Flashcard;

public interface FlashcardDao {
	
	public List<Flashcard> getAllFlashcards();
	public Flashcard getFlashcardById(int id);
	public void addFlashcard(Flashcard f);
	public void updateFlashcard(Flashcard f);
	public void deleteFlashcard(Flashcard f);

}
