package labOOP9.shop;

import labOOP9.Student;

import java.math.BigDecimal;

public class Shop implements Comparable<Shop> {

    private  String name ;
    private BigDecimal bigDecimal;
    private int rating;

    public Shop() {
    }

    public Shop(String name, BigDecimal bigDecimal, int rating) {
        this.name = name;
        this.bigDecimal = bigDecimal;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", bigDecimal=" + bigDecimal +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Shop o) {
        return this.name.compareTo(o.getName());
    }
}
