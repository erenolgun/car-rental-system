/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


/**
 *
 * @author ereno
 */
public class EconomicCar extends Car{

    public EconomicCar(int carID, String brand, String model, String fuelType, String gearType, int modelYear, double price) {
        super(carID, brand, model, fuelType, gearType, modelYear, price);
        this.carType = "Economic";
    }

    @Override
    public double discountedPrice() {
        long totalDay = (rentedDates.get(1).getTimeInMillis() - rentedDates.get(0).getTimeInMillis()) / 86400000;
        if(7 <= totalDay && totalDay < 30){
            price = price * 0.97;
        } else if(totalDay >= 30 ){
            price = price * 0.92;
        }
        return price;
    }

    @Override
    public double additionalPrice(double price, boolean childSeat, boolean navigation, boolean snowTire, boolean HGS, boolean scooter, boolean tireProtection, boolean windowProtection, boolean headlightProtection, boolean comprehensiveProtection) {
        if(childSeat){
            price += 30;
        }
        if(navigation){
            price += 20;
        }
        if(snowTire){
            price += 50;
        }
        if(HGS){
            price += 60;
        }
        if(scooter){
            price += 15;
        }
        if(tireProtection){
            price += 20;
        }
        if(windowProtection){
            price += 25;
        }
        if(headlightProtection){
            price += 15;
        }
        if(comprehensiveProtection){
            price += 50;
        }
        return price;
    }
    
}
