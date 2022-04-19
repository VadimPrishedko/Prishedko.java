package views;


import utils.Validator;

import java.util.Scanner;

// View
public class SalesView {


    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;

    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.


    public SalesView() {
    }

    public SalesView(String title, String name, int quantity, double price, Scanner scanner) {
        this.title = title;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.scanner = scanner;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);
        Validator validator = new Validator();

        title = "Введите наименование товара: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        name = validator.validateName(scanner);

        title = "Введите количество: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.

        System.out.println(title);
        quantity = validator.validateQuantityInput(scanner);

        title = "Введите цену: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        price = validator.validatePriceInput(scanner);

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
