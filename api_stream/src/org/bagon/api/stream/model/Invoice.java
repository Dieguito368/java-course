package org.bagon.api.stream.model;

public class Invoice {
    private User user;
    private String description;

    public Invoice(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return this.user + " -> " + this.description;
    }
}
