package com.company;

public class Vehicle {


    //constructor
    public Vehicle(){};

    private String wheels;
    private String doors;
    private String engine;
    private int speed;
    private String color;
    private int age;

    //wheels
    public String getWheels(){ return wheels;}
    public void setWheels(String value){wheels = value;}
    //doors
    public String getDoors(){ return doors;}
    public void setDoors(String value){doors = value;}
    //engine
    public String getEngine(){ return engine;}
    public void setEngine(String value){engine = value;}
    //speed
    public int getSpeed(){ return speed;}
    public void setSpeed(int value){speed = value;}
    //color
    public String getColor(){ return color;}
    public void setColor(String value){color = value;}
    //age
    public int getAge() {return age;}
    public void setAge(int value){age = value;}

    //start
    public String start(){return "the vehicle is starting.";}
    //accelerate
    public String accelerate() {return "the vehicle is accelerating.";}
    //stop
    public String stop() {return "the vehicle is stopped.";}
}
