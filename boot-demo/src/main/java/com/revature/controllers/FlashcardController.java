package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.beans.Category;
import com.revature.beans.Flashcard;
import com.revature.services.FlashcardService;

@CrossOrigin
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
	
	@GetMapping("/byCategory/{catId}")
	@ResponseBody
	public ResponseEntity<List<Flashcard>> getFlashcardsByCategory(@PathVariable int catId){
		return new ResponseEntity<>(fs.getFlashcardsByCategory(new Category(catId, null)), HttpStatus.OK);
	}
	
	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<String> addFlashcard(@RequestBody Flashcard f){
		ResponseEntity<String> resp = null;
		try {
			fs.addFlashcard(f);
			resp = new ResponseEntity<>("FLASHCARD CREATED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO CREATE FLASHCARD", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}

}
