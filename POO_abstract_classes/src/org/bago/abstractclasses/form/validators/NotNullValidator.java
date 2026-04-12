package org.bago.abstractclasses.form.validators;

public class NotNullValidator extends Validator {
    public NotNullValidator() {
        this.message = "The %s field cannot be null";
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
        return value != null;
    }
}