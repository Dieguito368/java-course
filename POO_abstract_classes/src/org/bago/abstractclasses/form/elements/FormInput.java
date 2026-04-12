package org.bago.abstractclasses.form.elements;

public class FormInput extends FormElement {
    private String type = "text";

    public FormInput(String name) {
        super(name);
    }

    public FormInput(String name, String type) {
        super(name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String drawHTML() {
        return "<input " +
            "type='" + type +
            "' name='" + name + "' " +
            "value='" + value + "' " +
        "/>";
    }


}