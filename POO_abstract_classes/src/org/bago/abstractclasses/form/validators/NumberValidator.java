package org.bago.abstractclasses.form.validators;

public class NumberValidator extends Validator {
    public NumberValidator() {
        this.message = "The %s field must be a number";
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public boolean isValid(String value) {
        try {
            Integer.parseInt(value);

            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}