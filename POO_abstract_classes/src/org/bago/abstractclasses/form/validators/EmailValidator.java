package org.bago.abstractclasses.form.validators;

public class EmailValidator extends Validator {
    private final static String REGEX_EMAIL = "^(.+)@(.+)$";

    public EmailValidator() {
        this.message = "The %s field has an invalid format";
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public boolean isValid(String value) {
        return value.matches(REGEX_EMAIL);
    }
}