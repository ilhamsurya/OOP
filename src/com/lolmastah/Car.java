package com.lolmastah;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("Laqua Area XI") || validModel.equals("honda")){
            this.model = model;
        } else{
            this.model = "unknown";
        }
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }



}
