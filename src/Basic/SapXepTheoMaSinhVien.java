/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 *
 * @author admin
 */
public class SapXepTheoMaSinhVien {
    private String ma,lop,name,email;

    public SapXepTheoMaSinhVien(String ma, String lop, String name, String email) {
        this.ma = ma;
        this.lop = lop;
        this.name = name;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return this.ma + " "+ this.name +" "+this.lop +" "+ this.email;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SapXepTheoMaSinhVien> arr = new ArrayList<>();
       
        while(sc.hasNext()){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            arr.add(new SapXepTheoMaSinhVien(ma,lop,name,email));
        }
        Comparator c = new Comparator<SapXepTheoMaSinhVien>(){
            @Override
            public int compare(SapXepTheoMaSinhVien o1, SapXepTheoMaSinhVien o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        };
        Collections.sort(arr, c);
        for(SapXepTheoMaSinhVien x : arr){
            System.out.println(x);
        }
    }
}
