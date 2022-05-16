/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.kethua;

/**
 *
 * @author Phong
 */
public class Employee extends Person{
    private double salary;

    public Employee() {
        System.out.println("Default constructor of Employee class !");
    }
    

    public Employee(double salary, String name, String birth, String address) {
        super(name, birth, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee :" + this.birth + " "+this.name+" "+ super.toString() +" "+String.format("%.2f", this.salary); 
    }
    
}
