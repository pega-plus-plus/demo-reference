package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Flashcard;

@Repository
public interface FlashcardRepository extends JpaRepository<Flashcard, Integer>{

}
