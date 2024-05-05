package com.productservice.nihal.productservicenihal.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateProductDTO {

    private String title;
    private String price;
    private String description;
    private String image;
    private  String category;

}
