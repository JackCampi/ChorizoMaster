package es.nacho.redeem.mapper;

import es.nacho.redeem.model.Product;
import es.nacho.redeem.web.dto.ProductDto;

public interface ProductMapper {
    static ProductDto toProductDto(Product product){
        return new ProductDto(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getStock(),
                product.getImageUrl());
    }
}
