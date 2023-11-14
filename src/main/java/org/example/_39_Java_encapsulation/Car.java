package org.example._39_Java_encapsulation;

//***********************************************
public class Car {


    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

//private stuff cannot be accessed by normal way ,they need getters and setters,LIKE BELOW,ELSE IT WILL BE NOT VISIBLE
    //GETTERS
    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    //SETTERS
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
