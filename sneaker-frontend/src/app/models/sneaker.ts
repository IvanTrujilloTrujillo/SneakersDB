export class Sneaker {

  constructor(
    private _id: number,
    private _name: string,
    private _price: number,
    private _specialEdition: boolean,
    private _author: string,
    private _creationDate: Date,
    private _artistCollaborator: string
  ) {}

  public get artistCollaborator(): string {
    return this._artistCollaborator;
  }
  public set artistCollaborator(value: string) {
    this._artistCollaborator = value;
  }
  public get creationDate(): Date {
    return this._creationDate;
  }
  public set creationDate(value: Date) {
    this._creationDate = value;
  }
  public get author(): string {
    return this._author;
  }
  public set author(value: string) {
    this._author = value;
  }
  public get specialEdition(): boolean {
    return this._specialEdition;
  }
  public set specialEdition(value: boolean) {
    this._specialEdition = value;
  }
  public get price(): number {
    return this._price;
  }
  public set price(value: number) {
    this._price = value;
  }
  public get name(): string {
    return this._name;
  }
  public set name(value: string) {
    this._name = value;
  }
  public get id(): number {
    return this._id;
  }
  public set id(value: number) {
    this._id = value;
  }
}
