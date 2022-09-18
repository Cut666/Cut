package baitap.BaiTapBuoi10.baitap2;

import baitap.buoi5.*;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner scanner = null;
        DangKyDangNhap dangKyDangNhap = null;
        scanner = new Scanner(System.in);
        dangKyDangNhap = new DangKyDangNhap();
        try {
            while (true) {
                System.out.println("Dang ky/Dang nhap");
                System.out.println("Nhap so 1: Dang ky");
                System.out.println("Nhap so 2: Dang nhap");
                System.out.println("Nhap so 3: Thoat ung dung:");
                String line = scanner.nextLine();
                switch (line) {
                    case "1": {
                        System.out.println("Nhap thong tin dang ky");
                                System.out.print("Nhap gmail: ");
                                String gmail = scanner.nextLine();
                                System.out.print("Nhap mat khau:");
                                String pass = scanner.nextLine();
                                System.out.print("Nhap lai mat khau: ");
                                String passagain = scanner.nextLine();
                                HocVien hocVien = new HocVien(gmail,pass,passagain);
                                dangKyDangNhap.dangKy(hocVien);
                                Pattern p = Pattern.compile("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
                                    if(p.matcher(gmail).find() && pass.equals(passagain)){
                                        System.out.println("Sign Up Success");
                                        break;
                                    }
                                    else {
                                        System.err.println("Sign Up failed");
                                    }

                        break;
                    }
                    case "2": {
                        System.out.println("nhap gmail: ");
                        String gmail = scanner.nextLine();
                        System.out.println(("Nhap pass: "));
                        String pass= scanner.nextLine();
                        System.out.println(dangKyDangNhap.dangNhap(gmail,pass));
                        break;
                    }
//
                    case "3": {
                        return;
                    }
                    default:
                        System.out.println("Invalid");
                        continue;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
