package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="FLASHCARD")
public class Flashcard {
	
	public Flashcard() {
		super();
	}
	public Flashcard(String question, String answer, Category category) {
		super();
		this.question = question;
		this.answer = answer;
		this.category = category;
	}
	public Flashcard(int id, String question, String answer, Category category) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
		this.category = category;
	}
	@Id //indicates a primary key
	@GeneratedValue(strategy= GenerationType.AUTO, generator="flashcardSeq")
	@SequenceGenerator(allocationSize=1, name="flashcardSeq", sequenceName="SQ_FLASHCARD_PK")
	@Column(name="FLASHCARD_ID")
	private int id;
	@Column(name="QUESTION")
	private String question;
	@Column(name="ANSWER")
	private String answer;
	//create unidirectional relationship between category and flashcard
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CATEGORY_ID")
	private Category category;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Flashcard [id=" + id + ", question=" + question + ", answer=" + answer + ", category=" + category + "]";
	}

}
