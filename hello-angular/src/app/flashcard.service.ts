import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Flashcard } from './flashcard';
import { MessageService } from './message.service';
import { Observable, of} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FlashcardService {

  private flashcardsUrl = 'localhost:8082/flashcard/';

  constructor(
    private http: HttpClient,
    private messageService: MessageService) { }

  /** Log a FlashcardService message with the MessageService */
private log(message: string) {
  this.messageService.add(`FlashcardService: ${message}`); // template string (from ES6)
}

/** GET heroes from the server */
getFlashcards (): Observable<Flashcard[]> {
  return this.http.get<Flashcard[]>(this.flashcardsUrl + 'all');
}

}
