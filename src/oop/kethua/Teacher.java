/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.kethua;

/**
 *
 * @author admin
 */
public class Teacher extends Employee{
    private String faculty;

    public Teacher(){
        System.out.println("Default constructor of Teacher class !");
    }
    public Teacher(String faculty, double salary, String name, String birth, String address) {
        super(salary, name, birth, address);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    @Override
    public String toString(){
        return "Teacher :"+super.toString() +" "+this.faculty;
    }
}
