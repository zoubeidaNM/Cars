package com.company;

public class Car extends Vehicle {

    private String make;
    private String model;
    private int makeYear;

    //default constructor
    public Car() {}


    //overloaded constructor
    public Car(String tomake, String tomodel, int tomakeYear) {
        make = tomake;
        model = tomodel;
        makeYear = tomakeYear;
    }

    public String getFullName() {
        return this.getColor() + " " + make + " " + model;
    }


    //make
    public String getMake() {
        return make;
    }

    public void setMake(String tomake) {
        make = tomake;
    }

    //model
    public String getModel() {
        return model;
    }

    public void setModel(String tomodel) {
        model = tomodel;
    }

    //makeYear
    public int getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(int tomakeYear) {
        makeYear = tomakeYear;
    }

    @Override
    public String start() {
        String str = "The " + this.getColor() + " " + make + " " + model + " is starting";
        return str;
    }

    @Override
    public String accelerate() {
        String str = "The " + this.getColor() + " " + make + " " + model + " is accelerating";
        return str;

    }

    @Override
    public String stop() {
        String str = "The " + this.getColor() + " " + make + " " + model + " is stopped";
        return str;
    }

    public String passEmissionTest() {
        String str = "The " + this.getColor() + " " + make + " " + model + " passes its emission test";
        return str;
    }
}
