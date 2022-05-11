package ru.gb.gbrestmart.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import ru.gb.gbrestmart.entity.Product;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {

    @JsonProperty(value = "id")
    private Long orderId;
    private String name;
    private List<Long> products;
//    private String name;
//    private List<Product> products;

//    public void init(){
//        products.add(new Product(0L, "apple", 540.00));
//        products.add(new Product(1L, "tomato", 530.00));
//        products.add(new Product(2L, "potatoes", 690.00));
//        products.add(new Product(3L, "orange", 580.00));
//        products.add(new Product(4L, "beet", 566.00));
//    }

//    public boolean addProductToCart(Product product) {
//        return products.add(product);
//    }
//
//    public boolean deleteProduct(Product product) {
//        return products.remove(product);
//    }

}
