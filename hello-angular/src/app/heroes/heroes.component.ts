import { Component, OnInit } from '@angular/core';
import { Hero } from '../hero';
import { HeroService } from '../hero.service';

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})
export class HeroesComponent implements OnInit {

  heroes: Hero[];
  selectedHero: Hero;

  // use dependency injection to provide an instance of HeroService to the component
  constructor(private heroService: HeroService) { }

  ngOnInit() {
    this.getHeroes();
  }

  getHeroes(): void {
    this.heroService.getHeroes() // now we need to unpack the Observable
    .subscribe(heroList => this.heroes = heroList); // arrow notation - from ES6
  }

  onSelect(hero: Hero): void {
  this.selectedHero = hero;
  }

}
