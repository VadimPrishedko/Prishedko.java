package models;

import base.Fiscal;
import base.Income;

public class Product implements Income, Fiscal {

    private String name;
    private int quantity;
    private double price;
    final double TAXRATE = 5.0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTAXRATE() {
        return TAXRATE;
    }

    @Override
    public double beforeTaxes() {
        return quantity * price;
    }

    @Override
    public double taxes() {
        return beforeTaxes() /100 * TAXRATE;
    }

    @Override
    public double profit() {
        return beforeTaxes() - taxes();
    }

}
