import { AbstractControl, ValidationErrors, ValidatorFn } from "@angular/forms";

export class CustomValidators {

  static priceValidator(control: AbstractControl): ValidationErrors | null {
    const value = control.value;
    const regex = /^[0-9]*(\.[0-9]{1,2})?$/;
    if(!regex.test(value)) {
      return {invalidprice: true}
    }
    return null;
  }

  static artistCollaboratorRequired: ValidatorFn = (control: AbstractControl): ValidationErrors | null => {
    const specialEdition = control.get('specialEdition');
    const artistCollaborator = control.get('artistCollaborator');

    if(specialEdition?.value && artistCollaborator?.value === '') {
      return {invalidArtistCollaborator: true}
    }
    return null;
  }
}
