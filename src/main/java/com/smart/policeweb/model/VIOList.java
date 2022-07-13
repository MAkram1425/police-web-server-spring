package com.smart.policeweb.model;

import javax.persistence.*;

@Entity
@Table(name = "voi_list")
public class VIOList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String licencePlate;
    private String reason;
    private String make;
    private String model;
    private String yearOfManufacture;
    private String color;
    private String ownerName;
    private String ownerPhone;

    public VIOList() {
    }

    public VIOList(Long id, String licencePlate, String reason, String make, String model, String yearOfManufacture, String color, String ownerName, String ownerPhone) {
        this.id = id;
        this.licencePlate = licencePlate;
        this.reason = reason;
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.ownerName = ownerName;
        this.ownerPhone = ownerPhone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    @Override
    public String toString() {
        return "ReasonList{" +
                "id=" + id +
                ", licencePlate='" + licencePlate + '\'' +
                ", reason='" + reason + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                ", color='" + color + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", ownerPhone='" + ownerPhone + '\'' +
                '}';
    }
}
