package org.baugon.poointerfaces.printing.model;

public interface Printable {
    String TEXT = "default";

    default String print() {
        return TEXT;
    }

    static void print(Printable printable) {
        System.out.println(printable.print());
        System.out.println();
    }
}