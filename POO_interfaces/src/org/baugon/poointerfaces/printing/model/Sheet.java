package org.baugon.poointerfaces.printing.model;

abstract public class Sheet implements Printable {
    protected String content;

    public Sheet(String content) {
        this.content = content;
    }
}