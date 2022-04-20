package mapper;

import models.Product;
import models.ProductDto;

public class ProductMapper {
    public static void dtoToModel(ProductDto dto, Product model){
        model.setName(dto.getName());
        model.setQuantity(dto.getQuantity());
        model.setPrice(dto.getPrice());
    }
}
