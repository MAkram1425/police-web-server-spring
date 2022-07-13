package com.smart.policeweb.model;

import javax.persistence.*;

@Entity
@Table(name = "reason_list")
public class ReasonList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String carSNo;
    private String licencePlate;
    private String reason;
    private String description;
    private String make;
    private String model;
    private String dateOfManufacture;
    private String color;

    public ReasonList() {
    }

    public ReasonList(Long id, String carSNo, String licencePlate, String reason, String description, String make, String model, String dateOfManufacture, String color) {
        this.id = id;
        this.carSNo = carSNo;
        this.licencePlate = licencePlate;
        this.reason = reason;
        this.description = description;
        this.make = make;
        this.model = model;
        this.dateOfManufacture = dateOfManufacture;
        this.color = color;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ReasonList{" +
                "id=" + id +
                ", carSNo='" + carSNo + '\'' +
                ", licencePlate='" + licencePlate + '\'' +
                ", reason='" + reason + '\'' +
                ", description='" + description + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
