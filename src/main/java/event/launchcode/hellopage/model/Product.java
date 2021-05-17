package event.launchcode.hellopage.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Objects;

@MappedSuperclass
public abstract class Product {
    @Id
    @GeneratedValue
    @NotNull

    private int productId;

    @NotBlank
    private String name;
    @NotNull
    private int size;
    private String color;
    @NotNull
    private int price;
    @NotNull
    private Date date_of_Purchase;
    public Product(){

   }
    public Product(int productId,String name, int size, String color, int price) {
        this.productId=productId;
        this.name = name;
        this.size = size;
        this.color = color;
        this.price = price;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Date getDate_of_Purchase() {
        return date_of_Purchase;
    }

    public void setDate_of_Purchase(Date date_of_Purchase) {
        this.date_of_Purchase = date_of_Purchase;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product that = (Product) o;
        return productId == that.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

}



