import { Component, OnInit } from '@angular/core';
import { Flashcard } from '../flashcard';
import { FlashcardService } from '../flashcard.service';

@Component({
  selector: 'app-flashcard',
  templateUrl: './flashcard.component.html',
  styleUrls: ['./flashcard.component.css']
})
export class FlashcardComponent implements OnInit {

  flashcards: Flashcard[];

  constructor(private flashcardService: FlashcardService) { }

  getFlashcards(): void {
    this.flashcardService.getFlashcards()
      .subscribe(flashcards => this.flashcards = flashcards);
  }

  ngOnInit() {
    this.getFlashcards();
  }

}
