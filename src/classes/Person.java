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
public class Person {
    protected String name;
    protected String surname;
    protected String nationality;
    protected String idNumber;
    protected String birthdayDate;
    protected String licenceDate;
    protected String phone;
    protected String mail;

    public Person(String name, String surname, String nationality, String idNumber, String birthdayDate, String licenceDate, String phone, String mail) {
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
        this.idNumber = idNumber;
        this.birthdayDate = birthdayDate;
        this.licenceDate = licenceDate;
        this.phone = phone;
        this.mail = mail;
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNationality() {
        return nationality;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public String getLicenceDate() {
        return licenceDate;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public void setLicenceDate(String licenceDate) {
        this.licenceDate = licenceDate;
    }
    

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surname=" + surname + ", nationality=" + nationality + ", idNumber=" + idNumber + ", birthdayDate=" + birthdayDate + ", licenceDate=" + licenceDate + ", phone=" + phone + ", mail=" + mail + '}';
    }


}

