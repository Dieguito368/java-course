package org.bagon.poointerfaces.model;

import java.util.Objects;

public class EntityBase {
    protected Integer id;
    private static int lastId;

    public EntityBase() {
        this.id = ++lastId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EntityBase base = (EntityBase) o;
        return Objects.equals(id, base.id);
    }
}