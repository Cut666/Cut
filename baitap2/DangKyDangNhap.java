package baitap.BaiTapBuoi10.baitap2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DangKyDangNhap {
    private List<HocVien> listsv = new ArrayList<>();
    public void dangKy(HocVien hocVien){

        listsv.add(hocVien);
    }
    public String dangNhap(String gmail, String matKhau) {
        for (HocVien hocVien : listsv) {
            if (gmail.equals(hocVien.getGmail()) && matKhau.equals(hocVien.getMatKhau())) {
                return "Login Success";
            }
        }
        return "Login failed";
    }
}
