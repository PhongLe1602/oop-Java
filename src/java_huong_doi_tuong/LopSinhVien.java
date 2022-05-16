/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_huong_doi_tuong;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class LopSinhVien {
    private double x1,y1,x2,y2;

    public LopSinhVien(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public String toString(){
        double x = Math.pow(x1-x2, 2);
        double y = Math.pow(y1-y2, 2);
        String k = String.format("%.4f", Math.sqrt(x+y));
        return k;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            LopSinhVien  lopSv = new LopSinhVien(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
            System.out.println(lopSv.toString());
        }
    }
}
