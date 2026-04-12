package org.baugon.poointerfaces.printing.model;

public class Report extends Sheet {
    private String author;
    private String inspector;

    public Report(String author, String inspector, String content) {
        super(content);
        this.author = author;
        this.inspector = inspector;
    }

    @Override
    public String print() {
        return "Report written by: " + author + "\nReport reviewed by: " + inspector + "\n" + content;
    }
}