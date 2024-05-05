package com.productservice.nihal.productservicenihal.controller;

import com.productservice.nihal.productservicenihal.dto.CreateProductDTO;
import com.productservice.nihal.productservicenihal.dto.ProductResponseDTO;
import com.productservice.nihal.productservicenihal.models.Product;
import com.productservice.nihal.productservicenihal.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private  ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public  String getAllProducts() {
        return "Hello Api";
    }


    @GetMapping("/products/{id}")
    public ProductResponseDTO getProductById(@PathVariable("id") Integer id) {

        Product product=productService.getProductById(id);

        //Convert Product to dto

        return convertProductToResponseDTO(product);
    }

    private ProductResponseDTO convertProductToResponseDTO(Product product) {

        //Converting into ProductResponseDTO

        ProductResponseDTO responseDTO = new ProductResponseDTO();

        responseDTO.setCategory(product.getCategory());
        responseDTO.setId(product.getId());
        responseDTO.setDescription(product.getDescription());
        responseDTO.setPrice(product.getPrice());
        responseDTO.setTitle(product.getTitle());
        responseDTO.setImageURL(product.getImageURL());

        return responseDTO;
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody CreateProductDTO dto ) {

        Product product=productService.createProduct(dto);

        return product;



    }
}
