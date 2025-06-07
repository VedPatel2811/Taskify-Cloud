import { Component } from '@angular/core';
//import { RouterOutlet } from '@angular/router';
import { Header } from './header/header';
import { Content } from './content/content';

@Component({
  selector: 'app-root',
  //imports: [RouterOutlet],
  imports: [Header, Content],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected title = 'frontend';
}
