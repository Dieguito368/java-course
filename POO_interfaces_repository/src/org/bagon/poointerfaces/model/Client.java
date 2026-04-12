package org.bagon.poointerfaces.model;

public class Client extends EntityBase {
    private String name;
    private String surnames;

    public Client(String name, String surnames) {
        super();
        this.name = name;
        this.surnames = surnames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + " " + surnames;
    }
}