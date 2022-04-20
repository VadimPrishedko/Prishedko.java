package views;

import models.ProductDto;
import utils.Validator;
import java.util.Scanner;

public class SalesView {
    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;
    ProductDto productDto;

    public SalesView() {
        scanner = new Scanner(System.in);
        this.productDto = new ProductDto();
    }

    public ProductDto getProductDto() {
        return productDto;
    }

    public void getInputs() {
        title = "Введите наименование товара: ";
        System.out.println(title);
        name = Validator.validateName(scanner);

        title = "Введите количество: ";
        System.out.println(title);
        quantity = Validator.validateQuantityInput(scanner);

        title = "Введите цену: ";
        System.out.println(title);
        price = Validator.validatePriceInput(scanner);

        productDto.setName(name);
        productDto.setQuantity(quantity);
        productDto.setPrice(price);

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
