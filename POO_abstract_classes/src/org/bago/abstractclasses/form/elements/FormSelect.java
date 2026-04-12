package org.bago.abstractclasses.form.elements;

import org.bago.abstractclasses.form.elements.select.Option;

import java.util.ArrayList;
import java.util.List;

public class FormSelect extends FormElement {
    private List<Option> options;

    public FormSelect(String name) {
        super(name);
        this.options = new ArrayList<Option>();
    }

    public FormSelect(String name, List<Option> options) {
        super(name);
        this.options = options;
    }

    public void addOption(Option option) {
        this.options.add(option);
    }

    @Override
    public String drawHTML() {
        StringBuilder sb = new StringBuilder();

        sb.append("<select ");
        sb.append("name='").append(name).append("'>");
        for (Option option : options) {
            sb.append("\n\t<option ");
            sb.append("value='").append(option.getValue()).append("'");
            if(option.isSelected()) {
                sb.append(" selected");
                this.value = option.getValue();
            }
            sb.append(">");
            sb.append(option.getName());
            sb.append("</option>");
        }
        sb.append("\n</select>");

        return sb.toString();
    }
}