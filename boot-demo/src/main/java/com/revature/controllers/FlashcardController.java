package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.beans.Flashcard;
import com.revature.services.FlashcardService;

@Controller
@RequestMapping(value="/flashcard")
public class FlashcardController {
	
	private FlashcardService fs;
	
	@Autowired
	public void setFlashcardService(FlashcardService fs) {
		this.fs = fs;
	}
	
	@GetMapping("/all")
	@ResponseBody //indicates that we only want data, not a view, as the reponse 
	public ResponseEntity<List<Flashcard>> getAllFlashcards(){
		return new ResponseEntity<>(fs.getAllFlashcards(), HttpStatus.OK);
	}

}
