package baitap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class homework13 {
    public static void main(String[] args) {
//        b1();
//        b2();
//        b3();
//        b4();
//        b5();
//        b6();
//        b7();
//        b8();
//        b9();
        b10();
        b11();
    }

    public static void b1() {
        System.out.println("-----b1: Viết chương trình để in ra các phần tử của map-----");
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1, "Red");
        hashMap1.put(2, "Green");
        hashMap1.put(3, "Black");
        hashMap1.put(4, "White");
        hashMap1.put(5, "Blue");
        System.out.println(hashMap1);
    }

    public static void b2() {
        System.out.println("-----b2: tính tổng số phần tử-----");
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1, "Red");
        hashMap1.put(2, "Green");
        hashMap1.put(3, "Black");
        hashMap1.put(4, "White");
        hashMap1.put(5, "Blue");
        System.out.println("Tổng sổ các phần tư hashmap: " + hashMap1.size());
    }

    public static void b3() {
        System.out.println("-----b3: copy các ptu của map1 sang map2 (ko sử dụng method clone)-----");
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1, "Red");
        hashMap1.put(2, "Green");
        hashMap1.put(3, "Black");
        hashMap1.put(4, "White");
        hashMap1.put(5, "Blue");
        HashMap<Integer, String> hashMap2 = new HashMap<Integer, String>();
        hashMap2 = hashMap1;
        System.out.println(hashMap2);
    }

    public static void b4() {
        System.out.println("b4: loại bỏ các phần tử khỏi map");
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1, "Red");
        hashMap1.put(2, "Green");
        hashMap1.put(3, "Black");
        hashMap1.put(4, "White");
        hashMap1.put(5, "Blue");
        hashMap1.clear();
        System.out.println(hashMap1);
    }

    public static void b5() {
        System.out.println("b5: check xem 1 map có phải là map rỗng hay không");
        HashMap<String, String> hashMap = new HashMap<>();
        if (hashMap.size() == 0) {
            System.out.println("map rỗng");
        } else {
            System.out.println("map không rỗng");
        }
    }

    public static void b6() {
        System.out.println("b6: shallow copy 1 map");
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1, "Red");
        hashMap1.put(2, "Green");
        hashMap1.put(3, "Black");
        hashMap1.put(4, "White");
        hashMap1.put(5, "Blue");
        HashMap<Integer, String> hashMap2 = (HashMap<Integer, String>) hashMap1.clone();
        System.out.println(hashMap2);
    }

    public static void b7() {
        System.out.println("b7: check xem 1 map có chứa 1 key cụ thể không");
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1, "Red");
        hashMap1.put(2, "Green");
        hashMap1.put(3, "Black");
        hashMap1.put(4, "White");
        hashMap1.put(5, "Blue");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập 1 key cu the: ");
        int keysc = sc.nextInt();
        String i = hashMap1.get(keysc);
        if (i == null) {
            System.out.println("map khong chua key: " + keysc);
        } else {
            System.out.println("map chua key: " + keysc + " voi gia tri: " + i);
        }
    }

    public static void b8() {
        System.out.println("b8: lấy tập hợp các value của 1 map");
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1, "Red");
        hashMap1.put(2, "Green");
        hashMap1.put(3, "Black");
        hashMap1.put(4, "White");
        hashMap1.put(5, "Blue");
        Iterator<String> iter = hashMap1.values().iterator();
        while (iter.hasNext()) {

            System.out.print(iter.next() + " ");
        }
    }

    public static void b9() {
        System.out.println("b9: lấy value tương ứng của 1 key cụ thể trong map");
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1, "Red");
        hashMap1.put(2, "Green");
        hashMap1.put(3, "Black");
        hashMap1.put(4, "White");
        hashMap1.put(5, "Blue");
        String val = hashMap1.get(3);
        System.out.println(val);
    }

    public static void b10() {
        System.out.println("b10: lấy tập hợp các key của 1 map");
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1, "Red");
        hashMap1.put(2, "Green");
        hashMap1.put(3, "Black");
        hashMap1.put(4, "White");
        hashMap1.put(5, "Blue");
        Iterator<Integer> iter = hashMap1.keySet().iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static void b11() {
        System.out.println("B11: lấy tập hợp các value của 1 map");
        System.out.println("đề bài giống bài 8");
    }
}
