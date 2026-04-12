package org.gonzalez.invoicesapp.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice {
    private final int folio;
    private String description;
    private Date date;
    private Client client;
    private final InvoiceItem[] items;
    private int indexItems;
    private static final int MAX_ITEMS = 10;
    private static int lastFolio;

    public Invoice(String description, Client client) {
        this.folio = ++lastFolio;
        this.description = description;
        this.client = client;
        this.items = new InvoiceItem[MAX_ITEMS];
        this.date = new Date();
    }

    public int getFolio() {
        return folio;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public InvoiceItem[] getItems() {
        return items;
    }

    public void addInvoiceItem(InvoiceItem item) {
        if(indexItems < MAX_ITEMS) {
            this.items[indexItems++] = item;
        }
    }

    public double calculateTotal() {
        float total = 0;

        for (int i = 0; i < this.indexItems; i++) {
            InvoiceItem item = this.items[i];

            total += (float) item.calculateAmount();
        }

        return total;
    }

    public String generateDetail() {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM yyyy");

        sb.append("Invoice No. ").append(folio);
        sb.append("\nIssue Date: ").append(df.format(this.date ));
        sb.append("\nClient: ").append(client.getName());
        sb.append("\nDescription: ").append(description);
        sb.append("\n\nProducts: ");
        sb.append("\nCode\tName\tPrice\tQuantity\tSubtotal\n");

        for (int i = 0; i < this.indexItems; i++) {
            InvoiceItem item = this.items[i];

            sb.append(item.getProduct().getCode());
            sb.append("\t\t").append(item.getProduct().getName());
            sb.append("\t\t").append(item.getProduct().getPrice());
            sb.append("\t\t").append(item.getQuantity());
            sb.append("\t\t").append(item.calculateAmount());
            sb.append("\n");
        }

        sb.append("\nTotal: ").append(this.calculateTotal());

        return sb.toString();
    }
}