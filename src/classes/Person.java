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
public abstract class Person {
    protected String name;
    protected String surname;
    protected String nationality;
    public static int idNumber;
    protected int phone;
    protected String mail;

    public Person(String name, String surname, String nationality, int phone, String mail) {
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
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

    public int getPhone() {
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

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surname=" + surname + ", nationality=" + nationality + ", phone=" + phone + ", mail=" + mail + '}';
    }
}

