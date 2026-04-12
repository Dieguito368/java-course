package org.baugon.poointerfaces.printing.model;

public class Page extends Sheet {
    public Page(String content) {
        super(content);
    }

    @Override
    public String print() {
        return this.content;
    }
}