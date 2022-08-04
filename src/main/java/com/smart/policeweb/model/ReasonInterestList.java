package com.smart.policeweb.model;

import javax.persistence.*;

@Entity
@Table(name = "reason_interest_list")
public class    ReasonInterestList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String carSNo;
    private String licencePlate;
    private String description;
    private String reason;
    private String make;
    private String color;
    private String yearOfManufacturer;
    private String model;

    public ReasonInterestList() {
    }

    public ReasonInterestList(Long id, String carSNo, String licencePlate, String description, String reason, String make, String color, String yearOfManufacturer, String model) {
        this.id = id;
        this.carSNo = carSNo;
        this.licencePlate = licencePlate;
        this.description = description;
        this.reason = reason;
        this.make = make;
        this.color = color;
        this.yearOfManufacturer = yearOfManufacturer;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarSNo() {
        return carSNo;
    }

    public void setCarSNo(String carSNo) {
        this.carSNo = carSNo;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYearOfManufacturer() {
        return yearOfManufacturer;
    }

    public void setYearOfManufacturer(String yearOfManufacturer) {
        this.yearOfManufacturer = yearOfManufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "ReasonInterestList{" +
                "id=" + id +
                ", carSNo='" + carSNo + '\'' +
                ", licencePlate='" + licencePlate + '\'' +
                ", description='" + description + '\'' +
                ", reason='" + reason + '\'' +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", yearOfManufacturer='" + yearOfManufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
