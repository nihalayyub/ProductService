package com.productservice.nihal.productservicenihal.service;

import com.productservice.nihal.productservicenihal.dto.CreateProductDTO;
import com.productservice.nihal.productservicenihal.models.Product;

public interface ProductService {

    Product getProductById(Integer id);
    Product getAllProducts();

    Product createProduct(CreateProductDTO createProductDTO);

}
