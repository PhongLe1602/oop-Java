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
public class LopPhanSo {
    public long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }
    
    private long tuSo,mauSo;

    public LopPhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    public void toiGian(){
       long GCD = gcd(this.tuSo,this.mauSo);
       this.tuSo/=GCD;
       this.mauSo/=GCD;
    }

    @Override
    public String toString() {
        return this.tuSo +"/"+this.mauSo;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LopPhanSo phanSo = new LopPhanSo(sc.nextLong(),sc.nextLong());
        phanSo.toiGian();
        System.out.println(phanSo.toString());
    }
}
