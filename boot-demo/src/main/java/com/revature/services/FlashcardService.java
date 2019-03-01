package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Category;
import com.revature.beans.Flashcard;
import com.revature.repositories.FlashcardRepository;

@Service
public class FlashcardService {

	private FlashcardRepository fr;

	@Autowired
	public void setFlashcardRepository(FlashcardRepository fr) {
		this.fr = fr;
	}

	public List<Flashcard> getAllFlashcards() {
		return fr.findAll();
	}

	public List<Flashcard> getFlashcardsByCategory(Category c) {
		return fr.getByCategory(c);
	}
	
	public void addFlashcard(Flashcard f) {
		fr.save(f);
	}
}
