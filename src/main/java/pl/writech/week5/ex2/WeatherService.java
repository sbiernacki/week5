package pl.writech.week5.ex2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.writech.week5.ex2.integration.WeatherBitReponse;

@Service
public class WeatherService {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private static final String url = "https://api.weatherbit.io/v2.0/current?";

    @Value("${api-key}")
    private String apiKey;
    @Value("${country}")
    private String country;

    public WeatherBitReponse receiveWeather(String city) {
        RestTemplate restTemplate = new RestTemplate();
        String endpoint = url + "city=" + city + "&country=" + country + "&key=" + apiKey;
        logger.info("Request to endpoint: " + endpoint);
        return restTemplate.getForObject(endpoint, WeatherBitReponse.class);
    }
}
