package org.primefaces.showcase.service;


import com.cn.lotary.base.dao.AbstractEntity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author jason
 */
@Entity
@Table(name = "CAR")
public class Car extends AbstractEntity implements Serializable {

    @Column(name = "MODEL")
    public String model;
    @Column(name = "YEAR")
    public int year;
    @Column(name = "MANUFACTURER")
    public String manufacturer;
    @Column(name = "COLOR")
    public String color;
    @Column(name = "BRAND")
    public String brand;
    @Column(name = "PRICE")
    public int price;

    public Car() {
    }

    public Car(String model, int year, String manufacturer, String color) {
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.color = color;
    }

    public Car(String model, int year, String manufacturer, String color, int price) {
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.color = color;
        this.price = price;
    }

    public Car(String id, String brand, int year, String color, int price) {
        this.year = year;
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
