package pl.writech.week5.ex2;

public class WeatherData {

    private String imgSrc;
    private String city;
    private String countryCode;
    private Integer humidity;
    private Integer couldCoverage;
    private Double pressure;
    private Double temp;

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getCouldCoverage() {
        return couldCoverage;
    }

    public void setCouldCoverage(Integer couldCoverage) {
        this.couldCoverage = couldCoverage;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }
}
