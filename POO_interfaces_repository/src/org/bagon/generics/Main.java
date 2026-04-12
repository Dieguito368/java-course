package org.bagon.generics;

import org.bagon.poointerfaces.model.Client;
import org.bagon.poointerfaces.model.PremiumClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Diego", "Bautista González"));

        Client client1 = clients.get(0);

        Client[] clientsArray = {
            new Client("Oswaldo", "Cornejo Argueta"),
            new Client("Arturo", "Figueroa Chino")
        };

        Integer[] wholeArray = { 1, 2, 3 };

        List<Client> clientsList = fromArrayTolist(clientsArray);
        List<Integer> wholeList = fromArrayTolist(wholeArray);

        clientsList.forEach(System.out::println);
        System.out.println("\n<---------------------------->\n");
        wholeList.forEach(System.out::println);
        System.out.println("\n<---------------------------->\n");

        List<String> names = fromArrayTolist(new String[]{ "Diego", "Fernando", "Diana" }, wholeArray);

        names.forEach(System.out::println);

        List<PremiumClient> premiumClients = fromArrayTolist(new PremiumClient[]{
            new PremiumClient("Rosa", "González Zavaleta")
        });

        System.out.println("\n<---------------------------->\n");

        printClients(clients);
        printClients(clientsList);
        printClients(premiumClients);

        System.out.println("\n<---------------------------->\n");

        System.out.println("The maximum of 1, 9 and 4 is: " + max(1, 9, 4 ));
        System.out.println("The maximum of 6.45, 1.45 and 4.23 is: " + max(6.45, 1.45, 4.23 ));
        System.out.println("The maximum of Apple, Melon and Pineapple is: " + max("Apple", "Melon", "Pineapple" ));
    }

    public static <T> List<T> fromArrayTolist(T[] array) {
        return Arrays.asList(array);
    }

    public static <T extends Number> List<T> fromArrayTolist(T[] array) {
        return Arrays.asList(array);
    }

    public static <T extends Client & Comparable<T>> List<T> fromArrayTolist(T[] array) {
        return Arrays.asList(array);
    }

    public static <T, G> List<T> fromArrayTolist(T[] array1, G[] array2) {
        for(G element : array2) {
            System.out.println(element);
        }

        return Arrays.asList(array1);
    }

    public static void printClients(List<? extends Client> clients) {
        clients.forEach(System.out::println);
    }

    public static <T extends  Comparable<T>> T max(T a, T b, T c) {
        T max = a;

        if(b.compareTo(max) > 0) {
            max = b;
        }

        if(c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }
}