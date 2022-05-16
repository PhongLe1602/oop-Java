/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;

/**
 *
 * @author admin
 */

// --Encapsulation : Đóng gói dữ liệu.
// --Inheritance : Kế thừa.
// --Polymophism : Đa hình.
public class StudentS {
    private String maSinhVien;
    private String hoTen;
    private String ngaySinh;
    private String lop;
    private double gpa;
    public StudentS(){
        maSinhVien = hoTen = ngaySinh = lop ="";
        gpa = 0;
    }

    public StudentS(int soThuTu, String hoTen, String ngaySinh, String lop, double gpa) {
        String s = "SV";
        String m = soThuTu +"";
        while(m.length() < 3) m = "0" + m;
        s += m;
        this.maSinhVien = s;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        String diem = String.format("%.2f", this.gpa);
        return this.maSinhVien +" "+this.hoTen +" "+ this.lop +" "+ this.ngaySinh +" "+ diem;
    }
    
    
    
    /**
     * @return the maSinhVien
     */
    public String getMaSinhVien() {
        return maSinhVien;
    }

    /**
     * @param maSinhVien the maSinhVien to set
     */
    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the ngaySinh
     */
    public String getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the lop
     */
    public String getLop() {
        return lop;
    }

    /**
     * @param lop the lop to set
     */
    public void setLop(String lop) {
        this.lop = lop;
    }

    /**
     * @return the gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
}

