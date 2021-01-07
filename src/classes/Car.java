/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author ereno
 */
public abstract class Car implements Price {
    protected int carID;
    protected String carType;
    protected String brand;
    protected String model;
    protected String fuelType;
    protected String gearType;
    protected int modelYear;
    protected double price;
    public ArrayList<GregorianCalendar> rentedDates = new ArrayList<>();
    private boolean childSeat;
    private boolean navigationSystem;
    private boolean snowTire;
    private boolean HGS;
    private boolean scooter;
    private boolean tireProtection;
    private boolean windowProtection;
    private boolean headlightProtection;
    private boolean comprehensiveDamagePackage;

    public Car(int carID, String brand, String model, String fuelType, String gearType, int modelYear, double price) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.gearType = gearType;
        this.modelYear = modelYear;
        this.price = price;
    }
    
    //PRICE EKLENDİĞİNDE ESKİ HALİNE BAK

    public int getCarID() {
        return carID;
    }

    public String getCarType() {
        return carType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getGearType() {
        return gearType;
    }

    public int getModelYear() {
        return modelYear;
    }

    public double getPrice() {
        return price;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String output = "";
        for (GregorianCalendar rentedDate : rentedDates) {
            output += "\n" + String.valueOf(rentedDate.get(Calendar.DAY_OF_MONTH) + "/" + String.valueOf(rentedDate.get(Calendar.MONTH) + 1) + "/") + String.valueOf(rentedDate.get(Calendar.YEAR));
        }
        return "Car ID=" + carID + "\nCar Type=" + carType + "\nBrand=" + brand + "\nModel=" + model + "\nFuel Type=" + fuelType + "\nGear Type=" + gearType + "\nModel Year=" + modelYear + "\nPrice=" + price + output;
    }

    public abstract double discountedPrice();
    
}
