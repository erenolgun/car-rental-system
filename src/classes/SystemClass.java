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
public class SystemClass {
    public static ArrayList<Person> customers = new ArrayList<>();
    public static ArrayList<Car> cars = new ArrayList<>();
    
    
    // boolean ya da void kontrolünü yap 
    public static boolean addPerson(Person p, int licenceYear, int licenceMonth, int licenceDay, int birthdayYear, int birthdayMonth, int birthdayDay) {
        //Customer c ve tarihler gui tarafından eklenip adderson metoduna aktarılacak.
        
        GregorianCalendar licenceDate = new GregorianCalendar(licenceYear, licenceMonth, licenceDay);
        GregorianCalendar birthdayDate = new GregorianCalendar(birthdayYear, birthdayMonth, birthdayDay);
        GregorianCalendar currentDate = new GregorianCalendar();
        
        boolean isAdded = false;
        
        if((currentDate.get(Calendar.YEAR) - licenceDate.get(Calendar.YEAR) >= 2) && (currentDate.get(Calendar.YEAR) - birthdayDate.get(Calendar.YEAR) >= 21)) {
            isAdded = customers.add(p);
        }
        
        return isAdded;
    }
    
    public static boolean removePerson(Person p){
        boolean isRemoved = false;
        isRemoved = customers.remove(p);
        return isRemoved;
    }
    
}
