package com.example.unit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnitApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnitApplication.class, args);
    }
    public int multiplier(int a, int b){
        return a*b;
    }
    public int multiplier2(int a){
        return a*0;
    }
    public int multiplier3(int a, int b) throws Exception {

        if (a > 999) {
            throw new Exception("a khong hop le");
        }
        return a*b;
    }


}
