/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author ereno
 */
public abstract class Car implements Price {
    private String brand;
    private String model;
    private String fuelType;
    private int doorNumber;
    private String gearType;
    private int price;
    private boolean isDriver;
    private int carCapacity;
    private String carColor;
    // GUI KISMINDA KONTROLÜNÜ (SAĞLA BURADA OLSUN MU OLMASIN MI)
    private Date pickUpDate;
    private Date returnDate;
    private boolean isAvailable;
    private boolean childSeat;
    private boolean navigationSystem;
    private boolean tireProtection;
    private boolean windowProtection;
    private boolean headlightProtection;
    private boolean comprehensiveDamagePackage;
    private boolean snowTire;
    private boolean HGS;
    private boolean youngDriverSurcharge;

    public Car(String brand, String model, String fuelType, int doorNumber, String gearType, int price, boolean isDriver, int carCapacity, String carColor, Date pickUpDate, Date returnDate, boolean isAvailable, boolean childSeat, boolean navigationSystem, boolean tireProtection, boolean windowProtection, boolean headlightProtection, boolean comprehensiveDamagePackage, boolean snowTire, boolean HGS, boolean youngDriverSurcharge) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.doorNumber = doorNumber;
        this.gearType = gearType;
        this.price = price;
        this.isDriver = isDriver;
        this.carCapacity = carCapacity;
        this.carColor = carColor;
        this.pickUpDate = pickUpDate;
        this.returnDate = returnDate;
        this.isAvailable = isAvailable;
        this.childSeat = childSeat;
        this.navigationSystem = navigationSystem;
        this.tireProtection = tireProtection;
        this.windowProtection = windowProtection;
        this.headlightProtection = headlightProtection;
        this.comprehensiveDamagePackage = comprehensiveDamagePackage;
        this.snowTire = snowTire;
        this.HGS = HGS;
        this.youngDriverSurcharge = youngDriverSurcharge;
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

    public int getDoorNumber() {
        return doorNumber;
    }

    public String getGearType() {
        return gearType;
    }

    public int getPrice() {
        return price;
    }

    public boolean isIsDriver() {
        return isDriver;
    }

    public int getCarCapacity() {
        return carCapacity;
    }

    public String getCarColor() {
        return carColor;
    }

    public Date getPickUpDate() {
        return pickUpDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public boolean isChildSeat() {
        return childSeat;
    }

    public boolean isNavigationSystem() {
        return navigationSystem;
    }

    public boolean isTireProtection() {
        return tireProtection;
    }

    public boolean isWindowProtection() {
        return windowProtection;
    }

    public boolean isHeadlightProtection() {
        return headlightProtection;
    }

    public boolean isComprehensiveDamagePackage() {
        return comprehensiveDamagePackage;
    }

    public boolean isSnowTire() {
        return snowTire;
    }

    public boolean isHGS() {
        return HGS;
    }

    public boolean isYoungDriverSurcharge() {
        return youngDriverSurcharge;
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

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setIsDriver(boolean isDriver) {
        this.isDriver = isDriver;
    }

    public void setCarCapacity(int carCapacity) {
        this.carCapacity = carCapacity;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setPickUpDate(Date pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setChildSeat(boolean childSeat) {
        this.childSeat = childSeat;
    }

    public void setNavigationSystem(boolean navigationSystem) {
        this.navigationSystem = navigationSystem;
    }

    public void setTireProtection(boolean tireProtection) {
        this.tireProtection = tireProtection;
    }

    public void setWindowProtection(boolean windowProtection) {
        this.windowProtection = windowProtection;
    }

    public void setHeadlightProtection(boolean headlightProtection) {
        this.headlightProtection = headlightProtection;
    }

    public void setComprehensiveDamagePackage(boolean comprehensiveDamagePackage) {
        this.comprehensiveDamagePackage = comprehensiveDamagePackage;
    }

    public void setSnowTire(boolean snowTire) {
        this.snowTire = snowTire;
    }

    public void setHGS(boolean HGS) {
        this.HGS = HGS;
    }

    public void setYoungDriverSurcharge(boolean youngDriverSurcharge) {
        this.youngDriverSurcharge = youngDriverSurcharge;
    }

    @Override
    public String toString() {
        return "Cars{" + "brand=" + brand + ", model=" + model + ", fuelType=" + fuelType + ", doorNumber=" + doorNumber + ", gearType=" + gearType + ", price=" + price + ", isDriver=" + isDriver + ", carCapacity=" + carCapacity + ", carColor=" + carColor + ", pickUpDate=" + pickUpDate + ", returnDate=" + returnDate + ", isAvailable=" + isAvailable + ", childSeat=" + childSeat + ", navigationSystem=" + navigationSystem + ", tireProtection=" + tireProtection + ", windowProtection=" + windowProtection + ", headlightProtection=" + headlightProtection + ", comprehensiveDamagePackage=" + comprehensiveDamagePackage + ", snowTire=" + snowTire + ", HGS=" + HGS + ", youngDriverSurcharge=" + youngDriverSurcharge + '}';
    }
    
    public abstract int price();
    
}
