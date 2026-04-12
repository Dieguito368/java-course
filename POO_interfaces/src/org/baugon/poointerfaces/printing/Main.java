package org.baugon.poointerfaces.printing;

import org.baugon.poointerfaces.printing.model.*;
import static org.baugon.poointerfaces.printing.model.Genre.*;
import static org.baugon.poointerfaces.printing.model.Printable.print;

public class Main {
    public static void main(String[] args) {
        Curriculum curriculum = new Curriculum("Diego", "Computer Science", "Curriculum Content");
        curriculum.addExperience("JavaScript")
            .addExperience("GCP")
            .addExperience("BTP")
            .addExperience("VTEX");

        Report report = new Report("Juan", "Sebastian", "Report content.....");

        Book book = new Book("The Hobbit", "J.R.R. Tolkien",  FANTASY);
        book.addPage(new Page("Chapter 1: In a hole in the ground there lived a hobbit"))
            .addPage(new Page("Chapter 2: Roast Mutton. Three very large trolls were sitting round a fire."))
            .addPage(new Page("Chapter 3: A Short Rest. They come to the valley of Rivendell."));

        print(curriculum);
        print(report);
        print(book);
    }
}