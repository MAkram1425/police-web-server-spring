package com.smart.policeweb.model;

import javax.persistence.*;

@Entity
@Table(name = "make_model_list")
public class MakeModelList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String carSNo;
    private String licencePlate;
    private String reason;
    private String make;
    private String model;

    public MakeModelList() {
    }

    public MakeModelList(Long id, String carSNo, String licencePlate, String reason, String make, String model) {
        this.id = id;
        this.carSNo = carSNo;
        this.licencePlate = licencePlate;
        this.reason = reason;
        this.make = make;
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

    @Override
    public String toString() {
        return "MakeModelList{" +
                "id=" + id +
                ", carSNo='" + carSNo + '\'' +
                ", licencePlate='" + licencePlate + '\'' +
                ", reason='" + reason + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
