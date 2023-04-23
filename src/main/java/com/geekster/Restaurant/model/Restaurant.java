package com.geekster.Restaurant.model;

public class Restaurant {
    private int id;
   private String name;
    private String address;
    private String number;
    private String specialty;
    private String totalStaff;
    private String ratings;

    public Restaurant(int id, String name, String address, String number, String specialty, String totalStaff, String ratings) {
        this.id=id;
        this.name = name;
        this.address = address;
        this.number = number;
        this.specialty = specialty;
        this.totalStaff = totalStaff;
        this.ratings = ratings;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(String totalStaff) {
        this.totalStaff = totalStaff;
    }
    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }
}
