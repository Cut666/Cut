package baitap.buoi6;

import java.util.Scanner;

public class thuVienApp {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        quanLyThuVien qltv = null;
        qltv = new quanLyThuVien();
        try {
            int i=0;
            while (true) {

                System.out.println("thong tin muon sach");
                System.out.println("Nhap so 1: muon sach");
                System.out.println("Nhap so 2: danh sach muon sach");
                System.out.println("Nhap so 3: Thoat ung dung");
                i++;
                String line = sc.nextLine();

                switch (line) {
                    case "1": {
                        System.out.println("Sô phiếu: TN0" + i);
                        System.out.print("Nhap ho ten: ");
                        String ten = sc.nextLine();
                        System.out.print("Nhap tuoi:");
                        String tuoi = sc.nextLine();
                        System.out.print("Nhap lop: ");
                        String lop = sc.nextLine();
                        System.out.print("Nhap ma the: ");
                        String maThe = sc.nextLine();
                        System.out.print("Nhap ngay muon: ");
                        String ngayMuon = sc.nextLine();
                        System.out.print("nhap ngay tra: ");
                        String ngayTra = sc.nextLine();
                        System.out.print("Nhap so hieu sach: ");
                        String soHieuSach= sc.nextLine();
                        theMuonSach themuonsach1 = new theMuonSach(ten,tuoi,lop,maThe,ngayMuon,ngayTra,soHieuSach);
                        qltv.muonSach(themuonsach1);
                        System.out.println("TN0" + i + themuonsach1.toString());
                        break;
                    }
                    case "2":{
                            for (SinhVien sinhvien: qltv.getQuanLyThuVienarr()){
                                if(sinhvien!=null){
                                    System.out.println(sinhvien.toString());
                                }
                        }
                        break;
                    }
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
