import { Component, OnInit } from '@angular/core';
import { Sneaker } from 'src/app/models/sneaker';
import { SneakerService } from 'src/app/services/sneaker.service';

@Component({
  selector: 'app-sneaker-list',
  templateUrl: './sneaker-list.component.html',
  styleUrls: ['./sneaker-list.component.css']
})
export class SneakerListComponent implements OnInit {

  sneakerList: Sneaker[] = []

  constructor(
    private sneakerService: SneakerService
  ) { }

  ngOnInit(): void {
    this.sneakerService.getSneakers().subscribe(result => {
      this.sneakerList = result;
    });
  }

}
