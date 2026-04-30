package org.bagon.api.stream.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String name;
    private String surnames;
    private Integer id;
    private static int lastId;
    private List<Invoice> invoices;

    public User(String name, String surnames) {
        this.name = name;
        this.surnames = surnames;
        this.id = ++lastId;
        this.invoices = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void addInvoice(Invoice invoice) {
        this.invoices.add(invoice);
        invoice.setUser(this);
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " " + surnames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(surnames, user.surnames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surnames);
    }
}