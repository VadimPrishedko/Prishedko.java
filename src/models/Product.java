package models;


import base.Fiscal;
import base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product implements Income, Fiscal {

    // Объявление полей модели
    private String name;
    private int quantity;
    private double price;
    // Налоговоу ставку объявите в виде константы
    // здесь ...
final double TAXRATE = 5.0;



    // Обеспечьте доступ к полям модели через getters и setters
    // здесь ...

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


    // Переопределите методы реализуемых интерфейсов.
public Income income;
    public Fiscal fiscal;
    // Расчёт дохода от продаж, до уплаты налога.
    // здесь ...

    public double beforeTaxes(){
        return quantity * price;
    }


    // Расчёт суммы налога с продаж.
    // здесь ...
public double taxes(){
        return beforeTaxes() /100 * TAXRATE;
}

    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...
public double profit(){
        return beforeTaxes() - taxes();
}

}
