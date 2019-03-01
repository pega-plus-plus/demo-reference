package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Category;
import com.revature.beans.Flashcard;

@Repository
public interface FlashcardRepository extends JpaRepository<Flashcard, Integer>{
	
	public List<Flashcard> getByCategory(Category c);

}
