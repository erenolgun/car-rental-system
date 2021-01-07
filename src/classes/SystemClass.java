/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;

/**
 *
 * @author ereno
 */
public class SystemClass {
    public static ArrayList<Person> customers = new ArrayList<>();
    public static ArrayList<Car> cars = new ArrayList<>();
    public static ArrayList<Car> rentedCar = new ArrayList<>();
    public static int id = 1;
    
    
    
    // boolean ya da void kontrolünü yap 
    public static boolean addPerson(Person p, int licenceYear, int licenceMonth, int licenceDay, int birthdayYear, int birthdayMonth, int birthdayDay) {
        //Customer c ve tarihler gui tarafından eklenip adderson metoduna aktarılacak.        
        GregorianCalendar licenceDate = new GregorianCalendar(licenceYear, licenceMonth, licenceDay);
        GregorianCalendar birthdayDate = new GregorianCalendar(birthdayYear, birthdayMonth, birthdayDay);
        GregorianCalendar currentDate = new GregorianCalendar();
        
        boolean isAdded = false;
        isAdded = customers.add(p);

        return isAdded;
    }
    
    public static boolean removePerson(Person p){
        boolean isRemoved = false;
        isRemoved = customers.remove(p);
        return isRemoved;
    }
    
    public static boolean addCar(Car c){
        boolean isAdded = false;
        isAdded = cars.add(c);
        id++;  
        return isAdded;
    }
    
    public static boolean addRentedCar(Car c){
        boolean isAdded = false;
        isAdded = rentedCar.add(c);
        id++;  
        return isAdded;
    }
    
    public static GregorianCalendar setCalendar(String date){
        String[] calendarAll = date.split("/");
        
        int day = Integer.parseInt(calendarAll[0]);
        int month = Integer.parseInt(calendarAll[1]) - 1;
        int year = Integer.parseInt(calendarAll[2]);
        
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        
        return calendar;
    }
    
    public static int searchPerson(JComboBox c){
        int position = 0;
        int i = 0;
        for (Person customer : SystemClass.customers) {
            if(customer.getIdNumber().equals(c.getSelectedItem())){
                position = i;
            }
            i++;
        }
        return position;
    }
    
    public static int searchCarByBrand(JComboBox c){
        int position = 0;
        int i = 0;
        for (Car car : SystemClass.cars) {
            if((car.getBrand() + " " + car.getModel() + " (" + car.getModelYear() + ")").equals(c.getSelectedItem())){
                position = i;
            }
            i++;
        }
        return position;
    }
    
    public static int searchCarByID(JComboBox c){
        int position = 0;
        int i = 0;
        for (Car car : SystemClass.cars) {
            if(String.valueOf(car.getCarID()).equals(c.getSelectedItem())){
                position = i;
            }
            i++;
        }
        return position;
    }
    
    public static boolean isAvailable(GregorianCalendar pickupDate, int carPosition) {
        boolean isAvailable = false;
        
        int isAvailableYear = pickupDate.get(Calendar.YEAR) -  SystemClass.cars.get(carPosition).rentedDates.get(1).get(Calendar.YEAR);
        int isAvailableMonth = pickupDate.get(Calendar.MONTH) -  SystemClass.cars.get(carPosition).rentedDates.get(1).get(Calendar.MONTH);
        int isAvailableDay = pickupDate.get(Calendar.DAY_OF_MONTH) -  SystemClass.cars.get(carPosition).rentedDates.get(1).get(Calendar.DAY_OF_MONTH);
    
        if( isAvailableDay >= 0 && isAvailableMonth >= 0 && isAvailableYear >= 0){
            isAvailable = true;
        }
        return isAvailable;
    }
}
