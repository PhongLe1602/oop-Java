/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.kethua;

/**
 *
 * @author admin
 */
public class Students extends Person{
    private String classname;
    private double GPA;

    public Students(String classname, double GPA, String name, String birth, String address) {
        //super(); super goi nhung phan tu k co tham so (luon dat o dau)
        super(name,birth,address);// gọi constructer của lớp cha day du tham so
        this.classname = classname;
        this.GPA = GPA;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return super.toString()+"  "+this.classname +" "+ String.format("%.2f", this.GPA)+" ";
        // this.getName() +" "+....
        // super.getName()
    }
}
