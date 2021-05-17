package pl.writech.week5.ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.writech.week5.ex2.integration.WeatherBitReponse;


@RestController
@CrossOrigin
public class WeatherApi {

    private final WeatherService weatherService;

    @Autowired
    public WeatherApi(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather/{city}")
    public ResponseEntity<WeatherResponse> getWeather(@PathVariable String city) {
        WeatherBitReponse weatherBitReponse = weatherService.receiveWeather(city);

        return new ResponseEntity<WeatherResponse>(ResponseMapper.doMapping(weatherBitReponse), HttpStatus.OK);
    }


}
