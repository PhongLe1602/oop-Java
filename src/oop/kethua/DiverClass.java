/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.kethua;

/**
 *
 * @author admin
 */
// constructor chaning
// Overriding: ghi đè
// Overloading: nạp chồng
// Inheritance
// lớp cha, lớp con
// Super
//Constructor chaining
// visibility, modifier, accerss : quy dinh phạm vi thuộc tính, phương thức ở trong 1 lớp.
//Superclass Type : kieu cua lop cha.
//Subclass Type : kiểu của lớp con
public class DiverClass {
    public static void main(String[] args) {
//        //Students s = new Students("CNTT1",3.2,"Le Van Phong","16/02/2002","Hai Duong");
//        Teacher t = new Teacher("CNTT",30000,"Le Van Phong","22/12/2002","Hai Duong");
//        System.out.println(t);
        Person p1 = new Employee();
        Employee p2 = new Teacher();
       // Person p2 = new Teacher();
        Object p3 = new Employee();
    }
}
