package baitap.BaiTapBuoi11.Bai1;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.logging.Logger;

public class BaiTap1 {
    public static void main(String[] args) {
    Post post = new Post();
    post.setTitle("Convert Java Object to String Json");
    post.setId("100L");
    post.setDescription("Use Jackson JSon API");
    post.setContent("HTML content");
    post.setLastUpdatedAt(new Date());
    post.setPostedAt(new Date());
        Gson gson = new Gson();
        String str = gson.toJson(post);
        System.out.println(str);
//        FileOutputStream fileJson = null;
//        fileJson = new FileOutputStream("product.json");
    }
}
