package com.example.demo.Model;

public class Cart {
    String productId;
    String Name;
    String qty;
    String total;

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return Name;
    }

    public String getQty() {
        return qty;
    }

    public String getTotal() {
        return total;
    }

    public Cart(String productId, String name, String qty, String total) {
        this.productId = productId;
        Name = name;
        this.qty = qty;
        this.total = total;
    }
}
