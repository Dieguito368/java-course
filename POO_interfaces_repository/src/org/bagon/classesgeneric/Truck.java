package org.bagon.classesgeneric;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Truck<T> implements Iterable<T> {
    private final List<T> objects;
    private final int max;

    public Truck(int max) {
        this.objects = new ArrayList<>();
        this.max = max;
    }

    public void add(T object) {
        if(objects.size() <= max) {
            this.objects.add(object);
        } else {
            throw new RuntimeException("Full list");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return objects.iterator();
    }
}
