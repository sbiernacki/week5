package pl.writech.week5.ex2;

import java.util.ArrayList;
import java.util.List;

public class WeatherResponse {

    List<WeatherData> data;

    public WeatherResponse() {
        this.data = new ArrayList<>();
    }

    public List<WeatherData> getData() {
        return data;
    }

    public void setData(List<WeatherData> data) {
        this.data = data;
    }
}
