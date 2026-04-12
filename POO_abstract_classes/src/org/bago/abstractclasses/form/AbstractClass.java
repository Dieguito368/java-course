package org.bago.abstractclasses.form;

import org.bago.abstractclasses.form.elements.*;
import org.bago.abstractclasses.form.elements.select.Option;
import org.bago.abstractclasses.form.validators.*;

import java.util.Arrays;
import java.util.List;

public class AbstractClass {
    public static void main(String[] args) {
        FormInput username = new FormInput("username");
        username.setValue("diego368");
        username.addValidator(new RequiredValidator());

        FormInput password = new FormInput("password", "password");
        password.setValue("13112002D");
        password.addValidator(new RequiredValidator());

        FormInput email = new FormInput("email", "email");
        email.setValue("bautistadiego368@gmail.com");
        email.addValidator(new RequiredValidator());
        email.addValidator(new EmailValidator());

        FormInput age = new FormInput("age", "number");
        age.setValue("23");
        age.addValidator(new RequiredValidator());
        age.addValidator(new NumberValidator());

        FormElement greeting = new FormElement("greeting") {
            @Override
            public String drawHTML() {
                return "<input name='" + this.name +"' value='" + this.value + "' disabled />";
            }
        };

        FormTextArea experience = new FormTextArea("experience", 5, 10);
        experience.setValue("3 months as a FullStack Web Developer");

        greeting.setValue("Hi how are things?");

        FormSelect language = new FormSelect("language");

        Option java = new Option("java", "Java");
        language.addOption(java);
        language.addOption(new Option("javascript", "JavaScript").setSelected(true));
        language.addOption(new Option("python", "Python"));
        language.addValidator(new NotNullValidator());

        List<FormElement> elements = Arrays.asList(username, password, email, age, greeting, experience, language);

        for(FormElement element : elements) {
            System.out.println(element.drawHTML());
        }

        elements.forEach(element -> {
            if(!element.isValid()) {
                element.getErrors().forEach(System.out::println);
            }
        });
    }
}
