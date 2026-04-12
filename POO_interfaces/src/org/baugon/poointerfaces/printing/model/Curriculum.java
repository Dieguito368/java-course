package org.baugon.poointerfaces.printing.model;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Sheet {
    private String person;
    private String major;
    private List<String> experiences;

    public Curriculum(String person, String major, String content) {
        super(content);
        this.person = person;
        this.major = major;
        this.experiences = new ArrayList<>();
    }

    public Curriculum addExperience(String experience) {
        this.experiences.add(experience);

        return this ;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();

        sb.append("Name: ").append(person).append("\n")
            .append("Resume: ").append(content).append("\n")
            .append("Major: ").append(major).append("\n")
            .append("Experiences:");

        for(String experience : experiences) {
            sb.append("\n- ").append(experience);
        }

        return sb.toString();
    }
}
