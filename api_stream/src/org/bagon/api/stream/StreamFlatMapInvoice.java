package org.bagon.api.stream;

import org.bagon.api.stream.model.Invoice;
import org.bagon.api.stream.model.User;

import java.util.Arrays;
import java.util.List;

public class StreamFlatMapInvoice {
    public static void main(String[] args) {
        User user = new User("Diego", "Bautista");
        User user2 = new User("Joaquin", "Gonzalez");
        User user3 = new User("Miguel", "Lopez");

        user.addInvoice(new Invoice("Xbox Game Pass Subscription"));
        user.addInvoice(new Invoice("Microsoft Office 365 License"));

        user2.addInvoice(new Invoice("Netflix Premium Subscription"));
        user2.addInvoice(new Invoice("Amazon Prime Membership"));

        user3.addInvoice(new Invoice("Spotify Family Plan"));
        user3.addInvoice(new Invoice("Apple iCloud Storage Plan"));

        List<User> users =  Arrays.asList(user, user2, user3);

        users.stream().flatMap(u -> u.getInvoices().stream()).forEach(System.out::println);
    }
}
