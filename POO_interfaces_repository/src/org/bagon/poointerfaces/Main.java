package org.bagon.poointerfaces;

import org.bagon.poointerfaces.model.Client;
import org.bagon.poointerfaces.repository.*;
import org.bagon.poointerfaces.repository.exceptions.DataAccessException;
import org.bagon.poointerfaces.repository.exceptions.ReadAccessDataException;
import org.bagon.poointerfaces.repository.list.ClientListRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            ClientRepository<Client> repo = new ClientListRepository();
            repo.create(new Client("Diego", "Bautista González"));
            repo.create(new Client("Ivone", "Guerrero Martínez"));
            repo.create(new Client("Nancy", "Zamora Velázquez"));
            repo.create(new Client("Juan", "Huerta Fernández"));
            Client sara = new Client("Sara", "Gúzman Bautista");
            repo.create(sara);
            repo.create(sara);

            List<Client> clients = repo.list();
            System.out.println("\n<---- CLIENTS ---->");
            clients.forEach(System.out::println);

            System.out.println("\n<---- PAGINATED CLIENTS ---->");
            List<Client> pageable = repo.list(0, 2);
            pageable.forEach(System.out::println);

            System.out.println("\n<---- ORDERED CLIENTS ---->");
            List<Client> orderable = repo.list("id", Direction.DESC);
            orderable.forEach(System.out::println);

            System.out.println("\n<---- UPDATE CLIENT ---->");
            Client client = new Client("Rosa", "González Zavaleta");
            client.setId(3);
            repo.update(client);
            System.out.println(repo.getById(3));

            System.out.println("\n<---- UPDATED CLIENTS ---->");
            repo.list().forEach(System.out::println);

            System.out.println("\n<---- DELETE CLIENT ---->");
            repo.delete(3);
            repo.list().forEach(System.out::println);

            System.out.println("\nTotal number of clients: " + repo.total());
        } catch(ReadAccessDataException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (DataAccessException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}