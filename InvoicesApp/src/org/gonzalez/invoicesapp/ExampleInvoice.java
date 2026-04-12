package org.gonzalez.invoicesapp;

import org.gonzalez.invoicesapp.models.*;

import java.util.Scanner;

public class ExampleInvoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Client client = new Client();
        client.setNif("1234-5");
        client.setName("Diego Bautista González");

        System.out.print("Enter the invoice description: ");
        String description = scanner.nextLine();

        Invoice invoice = new Invoice(description, client);

        Product product;

        for (int i = 0; i < 2 ; i++) {
            product = new Product();

            System.out.print("Enter product name " + product.getCode() + ": ");
            product.setName(scanner.nextLine());

            System.out.print("Enter product price " + product.getCode() + ": ");
            product.setPrice(scanner.nextDouble());

            System.out.print("Enter product quantity " + product.getCode() + ": ");

            scanner.nextLine();

            invoice.addInvoiceItem(new InvoiceItem(scanner.nextInt(), product));

            System.out.println();
        }

        System.out.println(invoice.generateDetail());
     }
}
