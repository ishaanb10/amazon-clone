package com.example.demo.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "products")
public class Product {

    String Id;
    String Name;

    String ImageUrl;

    Integer price;
    List<String> features;


    public Product(String id, String name, String imageUrl, Integer price, List<String> features) {
        Id = id;
        Name = name;
        ImageUrl = imageUrl;
        this.price = price;
        this.features = features;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getImageUrl() {
        return ImageUrl;
    }




    public void setId(String id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setFeatures(List<String> features) {
       this.features = features;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public Integer getPrice() {
        return price;
    }

    public List<String> getFeatures() {
        return this.features;
    }


}
