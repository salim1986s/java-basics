package om.gov.taxoman.entity;

import java.util.Arrays;

public class Product {
    private int id;
    private String name;
    private String description;
    private String[] catergories = new String[5];
    private double price;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", catergories=" + Arrays.toString(catergories) +
                ", price=" + price +
                '}';
    }

    public Product(int id, String name, String description, String[] catergories, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.catergories = catergories;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String[] getCatergories() {
        return catergories;
    }

    public void setCatergories(String[] catergories) {
        this.catergories = catergories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
