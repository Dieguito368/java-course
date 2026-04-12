package org.bago.abstractclasses.form.elements;

import org.bago.abstractclasses.form.validators.Validator;

import java.util.ArrayList;
import java.util.List;

abstract public class FormElement {
    protected String name;
    protected String value;

    private List<Validator> validators;
    private List<String> errors;

    public FormElement() {
        this.validators = new ArrayList<>();
        this.errors = new ArrayList<>();
    }

    public FormElement(String name) {
        this();
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    abstract public String drawHTML();

    public void addValidator(Validator validator) {
        this.validators.add(validator);
    }

    public List<String> getErrors() {
        return errors;
    }

    public boolean isValid() {
        for(Validator validator : validators) {
            if(!validator.isValid(this.value)) {
                this.errors.add(String.format(validator.getMessage(), name));
            }
        }

        return this.errors.isEmpty();
    }
}