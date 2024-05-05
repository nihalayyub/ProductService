package com.productservice.nihal.productservicenihal.dto;


import com.productservice.nihal.productservicenihal.models.Category;
import com.productservice.nihal.productservicenihal.models.Product;
import com.productservice.nihal.productservicenihal.service.FakeStoreService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreResponseDTO {

    private Integer id;
    private String title;
    private String price;
    private String category;
    private String description;
    private String image;


    public Product toProduct(){
        Product p = new Product();

        p.setId(id);
        p.setTitle(title);
        p.setPrice(price);
        p.setDescription(description);
        p.setImageURL(image);

        Category c = new Category();

        c.setName(category);

        p.setCategory(c);

        return p;


    }

}


    /*
     *
     *
     *  {
     *                 id:1,
     *                 title:'...',
     *                 price:'...',
     *                 category:'...',
     *                 description:'...',
     *                 image:'...
     *             }

     *             **/
