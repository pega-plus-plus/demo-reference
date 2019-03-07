// remember two different kinds of modules: Angular modules and Typescript modules
import { Category } from './category';

export class Flashcard {
    id: number;
    question: string;
    answer: string;
    category: Category;
}
