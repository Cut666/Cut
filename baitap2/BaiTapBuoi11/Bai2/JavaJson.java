package baitap.BaiTapBuoi11.Bai2;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Arrays;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class JavaJson {
    String id;
    String name;
    String permanent;
    Address address;

    int[] phoneNumbers;

    String role;

    String[] cities;

    Properties properties;


    @Override
    public String toString() {
        return "baitap2{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", permanent='" + permanent + '\'' +
                ", address=" + address +
                ", phoneNumbers=" + Arrays.toString(phoneNumbers) +
                ", role='" + role + '\'' +
                ", cities=" + Arrays.toString(cities) +
                ", properties=" + properties +
                '}';
    }
}

