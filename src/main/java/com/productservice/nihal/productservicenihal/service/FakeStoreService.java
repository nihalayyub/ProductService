package com.productservice.nihal.productservicenihal.service;

import com.productservice.nihal.productservicenihal.dto.CreateProductDTO;
import com.productservice.nihal.productservicenihal.dto.FakeStoreResponseDTO;
import com.productservice.nihal.productservicenihal.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.resource.ResourceUrlProvider;


@Service
public class FakeStoreService implements ProductService {

//    private final ResourceUrlProvider mvcResourceUrlProvider;
    private RestTemplate restTemplate;
    public FakeStoreService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
//        this.mvcResourceUrlProvider = mvcResourceUrlProvider;
    }


    @Override
    public Product getProductById(Integer id) {

        ResponseEntity<FakeStoreResponseDTO> response=restTemplate.getForEntity("https://fakestoreapi.com/products/"+id, FakeStoreResponseDTO.class);

        FakeStoreResponseDTO fakeStoreResponseDTO =response.getBody();


        return fakeStoreResponseDTO.toProduct();
    }

    @Override
    public Product getAllProducts() {
        return null;
    }

    @Override
    public Product createProduct(CreateProductDTO createProductDTO) {

//

        FakeStoreResponseDTO fakeStoreResponseDTO= restTemplate.postForObject("https://fakestoreapi.com/products", createProductDTO, FakeStoreResponseDTO.class);
        return fakeStoreResponseDTO.toProduct();
    }

}
