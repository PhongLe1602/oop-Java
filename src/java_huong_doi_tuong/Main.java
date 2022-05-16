/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_huong_doi_tuong;

import Basic.StudentS;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    public static String chuanHoa(String ngaySinh){
        StringBuilder sb = new StringBuilder(ngaySinh);
        if(sb.charAt(1) =='/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StudentS[] arr = new StudentS[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double gpa = sc.nextDouble();
            arr[i] = new StudentS(i+1,ten,lop,chuanHoa(ngaySinh),gpa);
        }   
        for(int i = 0; i < n; i++){
//            System.out.print(arr[i].getMaSinhVien() +
//                    " " + arr[i].getHoTen() + " " + arr[i].getLop() + " "
//                    +arr[i].getNgaySinh() + " ");
//            System.out.printf("%.2f",arr[i].getGpa());
//            System.out.println("");
              System.out.println(arr[i].toString());
        }
    }
}
