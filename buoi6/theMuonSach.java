package baitap.buoi6;

import java.util.Scanner;

public class theMuonSach extends SinhVien{
    //ham thuoc tinh
    private String maThe;
    private String ngayMuon;
    private String ngayTra;
    private String soHieuSach;
    //ham phuong thuc

    public theMuonSach(String ten, String tuoi, String lop, String maThe, String ngayMuon, String ngayTra, String soHieuSach) {
        super(ten, tuoi, lop);
        this.maThe = maThe;
        this.ngayMuon=ngayMuon;
        this.ngayTra=ngayTra;
        this.soHieuSach=soHieuSach;
    }

    public String getMaThe() {
        return maThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }
    public String toString() {
        return " {" +
                " ten = " + getTen() +
                ", tuoi = " + getTuoi() +
                ", lop =" + getLop() +
                ", ma the =" + getMaThe() +
                ", ngay muon =" + getNgayMuon()+
                ", ngay tra =" + getNgayTra()+
                ", so hieu sach =" + getSoHieuSach()+
                '}';
    }

}
