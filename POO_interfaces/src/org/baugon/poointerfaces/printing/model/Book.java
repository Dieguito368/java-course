package org.baugon.poointerfaces.printing.model;

import java.util.ArrayList;
import java.util.List;

public class Book implements Printable {
    private List<Page> pages;
    private String title;
    private String author;
    private Genre genre;

    public Book(String title, String author, Genre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = new ArrayList<>();
    }

    public Book addPage(Page page) {
        pages.add(page);

        return this;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title").append(title).append("\n")
            .append("Author: ").append(author).append("\n")
            .append("Genre: ").append(genre).append("\n");

        for(Page page : pages) {
            sb.append(page.print()).append("\n");
        }

        return sb.toString();
    }
}