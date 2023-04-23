package com.Geekster.Restaurant.Model;

public class restaurentmodel {
    private String name;
    private String adress;
    private String ph_no;
    private int totalstaff;
    private String speciality;
    private boolean delivery;
    private String foodtypes;
    private String id;
    public restaurentmodel(String name, String adress, String ph_no, int totalstaff, String speciality, boolean delivery, String foodtypes,String id) {
        this.name = name;
        this.adress = adress;
        this.ph_no = ph_no;
        this.totalstaff = totalstaff;
        this.speciality = speciality;
        this.delivery = delivery;
        this.foodtypes = foodtypes;
        this.id=id;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

    public void setTotalstaff(int totalstaff) {
        this.totalstaff = totalstaff;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public void setFoodtypes(String foodtypes) {
        this.foodtypes = foodtypes;
    }
    public void setId(String id) {
        this.id = id;
    }


    //getters
    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getPh_no() {
        return ph_no;
    }

    public int getTotalstaff() {
        return totalstaff;
    }

    public String getSpeciality() {
        return speciality;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public String getFoodtypes() {
        return foodtypes;
    }

    public String getId() {
        return id;
    }
}
