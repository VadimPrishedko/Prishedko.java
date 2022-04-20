package controllers;

import mapper.ProductMapper;
import models.Product;
import models.ProductDto;
import utils.Rounder;
import views.SalesView;

public class ProductController {

    Product model;
    SalesView view;

    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();
        ProductDto productDto = view.getProductDto();
        ProductMapper.dtoToModel(productDto, model);

        String name = model.getName();
        double beforeTaxes = model.beforeTaxes();
        double taxes = model.taxes();
        double profit = model.profit();

        String output = "Наименование товара: " + name + "\n" +
                "Общий доход (грн.): " + Rounder.rounding(beforeTaxes) + "\n" +
                "Сумма налога (грн.): " + Rounder.rounding(taxes) + "\n" +
                "Чистый доход (грн.): " + Rounder.rounding(profit);

        view.getOutput(output);
    }
}
