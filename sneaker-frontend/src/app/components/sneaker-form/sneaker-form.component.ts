import { Component, OnInit, ViewChild } from '@angular/core';
import { AbstractControl, FormControl, FormGroup, ValidatorFn, Validators } from '@angular/forms';
import { Sneaker } from 'src/app/models/sneaker';
import { SneakerService } from 'src/app/services/sneaker.service';
import { CustomValidators } from 'src/app/utils/custom-validators';

@Component({
  selector: 'app-sneaker-form',
  templateUrl: './sneaker-form.component.html',
  styleUrls: ['./sneaker-form.component.css']
})
export class SneakerFormComponent implements OnInit {

  form: FormGroup;

  nameField: FormControl;
  priceField: FormControl;
  specialEditionField: FormControl;
  authorField: FormControl;
  // creationDateField: FormControl;
  artistCollaboratorField: FormControl;

  constructor(
    private sneakerService: SneakerService
  ) {
    this.nameField = new FormControl('', [Validators.required]);
    this.priceField = new FormControl('', [Validators.required, CustomValidators.priceValidator]);
    this.specialEditionField = new FormControl();
    this.authorField = new FormControl('', [Validators.required]);
    // this.creationDateField = new FormControl('', [Validators.required]);
    this.artistCollaboratorField = new FormControl('', [CustomValidators.artistCollaboratorRequired]);

    this.form = new FormGroup({
      name: this.nameField,
      price: this.priceField,
      specialEdition: this.specialEditionField,
      author: this.authorField,
      // creationDate: this.creationDateField,
      artistCollaborator: this.artistCollaboratorField
    }, { validators: CustomValidators.artistCollaboratorRequired });
  }

  ngOnInit(): void {
  }

  onSubmit(): void {
    if(this.form.valid) {
      let special: boolean = this.specialEditionField.value;
      if(this.specialEditionField.value === null) {
        special = false;
      }
      const newSneaker: Sneaker = new Sneaker(1, this.nameField.value, this.priceField.value, special, this.authorField.value, new Date(), this.artistCollaboratorField.value);

      this.sneakerService.createSneaker(newSneaker).subscribe(dataResult => 
        (console.log('Sneaker ' + newSneaker.name + ' created!')
        ));
    } else {
      alert("The form has invalid fields");
    }
  }

}