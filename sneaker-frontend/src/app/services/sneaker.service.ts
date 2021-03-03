import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Sneaker } from '../models/sneaker';

@Injectable({
  providedIn: 'root'
})
export class SneakerService {

  readonly baseUrl: string = "http://localhost:8080";

  constructor(
    private http: HttpClient
  ) { }

  getSneakers(): Observable<Sneaker[]> {
    const url = this.baseUrl + "/sneakers";
    return this.http.get<Sneaker[]>(url);
  }

  createSneaker(sneaker: Sneaker): Observable<Sneaker> {
    let body = JSON.stringify(sneaker);
    const url = this.baseUrl + "/sneaker";

    body = body.replace(/"_/g, '"');
    return this.http.post<Sneaker>(url, body);
  }
}
