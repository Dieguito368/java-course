package org.bagon.poointerfaces;

import org.bagon.poointerfaces.model.Product;
import org.bagon.poointerfaces.repository.ClientRepository;
import org.bagon.poointerfaces.repository.Direction;
import org.bagon.poointerfaces.repository.exceptions.DataAccessException;
import org.bagon.poointerfaces.repository.exceptions.ReadAccessDataException;
import org.bagon.poointerfaces.repository.list.ProductListRepository;

import java.util.List;

public class MainProduct {
    public static void main(String[] args) {
        try {
            ClientRepository<Product> repo = new ProductListRepository();
            repo.create(new Product("Phone", 15000.00));
            repo.create(new Product("Mouse", 450.00));
            repo.create(new Product("Laptop", 21999.99));
            repo.create(new Product("Keyboard", 340.00));

            List<Product> products = repo.list();
            System.out.println("\n<---- PRODUCTS ---->");
            products.forEach(System.out::println);

            System.out.println("\n<---- PAGINATED PRODUCTS ---->");
            List<Product> pageable = repo.list(0, 2);
            pageable.forEach(System.out::println);

            System.out.println("\n<---- ORDERED PRODUCTS ---->");
            List<Product> orderable = repo.list("id", Direction.DESC);
            orderable.forEach(System.out::println);

            System.out.println("\n<---- UPDATE PRODUCT ---->");
            Product product = new Product("Computer", 32000.00);
            product.setId(3);
            repo.update(product);
            System.out.println(repo.getById(3));

            System.out.println("\n<---- UPDATED PRODUCTS ---->");
            repo.list().forEach(System.out::println);

            System.out.println("\n<---- DELETE PRODUCT ---->");
            repo.delete(3);
            repo.list().forEach(System.out::println);

            System.out.println("\nTotal number of products: " + repo.total());
        } catch (ReadAccessDataException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (DataAccessException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}