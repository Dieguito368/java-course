package org.gonzalez.invoicesapp.models;

public class InvoiceItem {
    private int quantity;
    private Product product;

    public InvoiceItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double calculateAmount() {
        return this.quantity * this.product.getPrice();
    }
}
