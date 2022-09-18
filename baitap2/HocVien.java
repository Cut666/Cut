package baitap.BaiTapBuoi10.baitap2;

public class HocVien {
    private String gmail;
    private String matKhau;
    private String nhapLaiMatKhau;

    public HocVien(String gmail, String matKhau, String nhapLaiMatKhau){
        this.gmail=gmail;
        this.matKhau=matKhau;
        this.nhapLaiMatKhau=nhapLaiMatKhau;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getNhapLaiMatKhau() {
        return nhapLaiMatKhau;
    }

    public void setNhapLaiMatKhau(String nhapLaiMatKhau) {
        this.nhapLaiMatKhau = nhapLaiMatKhau;
    }

    @Override
    public String toString() {
        return "HọcVien{" +
                "gmail='" + gmail + '\'' +
                ", matKhau='" + matKhau + '\'' +
                ", nhapLaiMatKhau='" + nhapLaiMatKhau + '\'' +
                '}';
    }
}
