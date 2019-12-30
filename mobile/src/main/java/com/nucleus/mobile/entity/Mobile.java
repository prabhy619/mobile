package com.nucleus.mobile.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Optional;

@Entity
@javax.persistence.Table(name = "mobile")
public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long Sno;
    @NotNull
    public String Brand;
    @NotNull
    public String Mode;
    @NotNull
    public int Price;

    Date dateOfRelease;

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public Date getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(Date dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    public Mobile(){}
   // public Mobile get(){return this;}
    public Long getSno() {
        return Sno;
    }

    public void setSno(Long sno) {
        Sno = sno;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getMode() {
        return Mode;
    }

    public Optional<String> getdaBrand() {
        return Optional.ofNullable(Brand);
    }
    public Optional<String> getdaMode() {
        return Optional.ofNullable(Mode);
    }

    public void setMode(String mode) {
        Mode = mode;
    }
}
