package com.akshay.Bookstore.model;

public class Product {

    public String imageId;
    public String imageUrl;
    public String name;
    public String description;

    public Product(String imageId, String imageUrl, String name, String description) {
        this.imageId = imageId;
        this.imageUrl = imageUrl;
        this.name = name;
        this.description = description;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
