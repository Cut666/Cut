package baitap.BaiTapBuoi11.Bai3;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
public class TheCar {
    String color;
    String type;

    @Override
    public String toString() {
        return "TheCar{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
