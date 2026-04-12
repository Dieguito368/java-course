package org.bago.abstractclasses.form.validators;

public class RequiredValidator extends Validator {
    public RequiredValidator() {
        this.message = "This %s field is required";
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
        return value != null && !value.isBlank();
    }
}