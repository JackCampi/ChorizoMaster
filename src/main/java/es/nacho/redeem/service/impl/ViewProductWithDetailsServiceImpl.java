package es.nacho.redeem.service.impl;

import es.nacho.redeem.mapper.ProductDetailsMapper;
import es.nacho.redeem.model.Product;
import es.nacho.redeem.repository.ProductRepository;
import es.nacho.redeem.service.api.ViewProductWithDetailsService;
import es.nacho.redeem.web.dto.ProductWithDetailsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ViewProductWithDetailsServiceImpl implements ViewProductWithDetailsService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductWithDetailsDto getProduct(Long id) throws Exception{
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()) {
            return ProductDetailsMapper.toProductDetailsDto(product.get());
        }else throw new Exception("Product no exists");
    }

    @Override
    public Collection<ProductWithDetailsDto> getList(Long companyNIT) throws Exception {
        return null;
    }
}
