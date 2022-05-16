/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.kethua;

/**
 *
 * @author admin
 */
public class Person {
    protected String name;
    protected String birth;
    private String address;

    public Person() {
        System.out.println("Default constructor of Person class !");
    }
    
    
    public Person(String name, String birth,String address) {
        this.name = name;
        this.birth = birth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person :" + this.name +" "+ this.birth +" "+ this.address;
    }
    
    
    
}
