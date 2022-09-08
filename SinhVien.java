package baitap.buoi6;

import java.util.Scanner;

public class SinhVien {
    //thuôc tính
    private String ten;
    private String tuoi;
    private String lop;
    //phương thức
    public SinhVien(String ten, String tuoi, String lop){
        this.ten = ten;
        this.tuoi = tuoi;
        this.lop = lop;
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

}
