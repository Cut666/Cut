package baitap.buoi6;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BaiTapRegex {
    public static void main(String[] args) {
            baitap5();
    }
    public static void baitap2(){
        System.out.println("baitap2: Viết chương trình Java khớp với một chuỗi có bắt đầu là ‘p’ các ký tự theo sau là ‘q’ xuất hiện 0 hoặc nhiều lần");
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("^[pP][q]{0,}$");
        while (true){
            System.out.print("nhap ky tu: ");
            String s = sc.nextLine();
            if(p.matcher(s).find()){
                System.out.println(s);
                break;
            }
            else {
                System.err.println("nhap lai \n vd:pqqq" );
            }
        }
    }
    public static void baitap3(){
        System.out.println("baitap3: Viết chương trình Java để khớp với chuỗi có các chữ cái thường được nối với nhau bằng dấu gạch dưới '_'");
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("^([a-z]{1}_)+[a-z]$");
        while (true){
            System.out.print("nhap ky tu: ");
            String s = sc.nextLine();
            if(p.matcher(s).find()){
                System.out.println(s);
                break;
            }
            else {
                System.err.println("nhap lai \n vd:a_b_c" );
            }
        }
    }
    public static void baitap4 (){
        System.out.println("baitap4: Viết chương trình Java để so khớp một chuỗi chỉ chứa chữ hoa và chữ thường, số và dấu gạch dưới '_'");
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("^[A-Za-z0-9_]+$");
        while (true){
            System.out.print("nhap ky tu: ");
            String s = sc.nextLine();
            if(p.matcher(s).find()){
                System.out.println(s);
                break;
            }
            else {
                System.err.println("nhap lai \n vd:sfsdfSFDFSD123_" );
            }
        }
    }
    public static void baitap5(){
            System.out.println("baitap5: Viết một chương trình Java trong đó kiểm tra một chuỗi có bắt đầu bằng một số là 5 hay không");
            Scanner sc = new Scanner(System.in);
            Pattern p = Pattern.compile("^[5].+$");
            while (true){
                System.out.print("nhap ky tu: ");
                String s = sc.nextLine();
                if(p.matcher(s).find()){
                    System.out.println(s);
                    break;
                }
                else {
                    System.err.println("nhap lai \n vd:5sdfsd" );
                }
            }
    }
}
