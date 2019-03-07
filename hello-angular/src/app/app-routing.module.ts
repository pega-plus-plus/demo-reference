import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FlashcardComponent } from './flashcard/flashcard.component';
import { HeroesComponent } from './heroes/heroes.component';
import { HeroDetailComponent } from './hero-detail/hero-detail.component';

const routes: Routes = [
  { path: '', redirectTo: '/flashcard', pathMatch: 'full' },
  { path: 'flashcard', component: FlashcardComponent },
  { path: 'heroes', component: HeroesComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
