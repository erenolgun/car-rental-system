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
public class ComfortCar extends Car{

    public ComfortCar(String brand, String model, String fuelType, int doorNumber, String gearType, int price, boolean isDriver, int carCapacity, String carColor, Date pickUpDate, Date returnDate, boolean isAvailable, boolean childSeat, boolean navigationSystem, boolean tireProtection, boolean windowProtection, boolean headlightProtection, boolean comprehensiveDamagePackage, boolean snowTire, boolean HGS, boolean youngDriverSurcharge) {
        super(brand, model, fuelType, doorNumber, gearType, price, isDriver, carCapacity, carColor, pickUpDate, returnDate, isAvailable, childSeat, navigationSystem, tireProtection, windowProtection, headlightProtection, comprehensiveDamagePackage, snowTire, HGS, youngDriverSurcharge);
    }

    @Override
    public int price() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double additionalPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
