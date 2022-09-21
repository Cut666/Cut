package baitap.BaiTapBuoi11.Bai3;
import baitap.BaiTapBuoi11.Bai2.JavaJson;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class BaiTap3 {
    public static void main(String[] args) {
        ArrayList<TheCar> arrCar = new ArrayList<>();
        Gson gson = new Gson();
        String jsonCarStr ="[{\"color\" : \"White\", \"type\" : \"Vinfast\" }, { \"color\" : \"Blue\", \"type\": \"Toyota\" }]";
        arrCar = gson.fromJson(jsonCarStr,ArrayList.class);
        System.out.println(arrCar.toString());

    }
}
