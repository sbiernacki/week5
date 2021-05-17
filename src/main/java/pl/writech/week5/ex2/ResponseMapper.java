package pl.writech.week5.ex2;

import pl.writech.week5.ex2.integration.WeatherBitReponse;

public class ResponseMapper {

    private static final String IMG_URL = "https://www.weatherbit.io/static/img/icons/";

    public static WeatherResponse doMapping(WeatherBitReponse weatherBitReponse) {
        WeatherResponse weatherResponse = new WeatherResponse();
        weatherBitReponse.getData().forEach(datum -> {
            WeatherData weather = new WeatherData();
            weather.setCountryCode(datum.getCountryCode());
            weather.setCity(datum.getCityName());
            weather.setCouldCoverage(datum.getClouds());
            weather.setHumidity(datum.getRh());
            weather.setPressure(datum.getPres());
            weather.setTemp(datum.getTemp());
            weather.setImgSrc(IMG_URL + datum.getWeather().getIcon() + ".png");
            weatherResponse.getData().add(weather);
        });

        return weatherResponse;
    }
}
