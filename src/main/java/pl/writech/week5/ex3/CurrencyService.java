package pl.writech.week5.ex3;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class CurrencyService {

    public static Map<String, Double> getCurrencyMap() {
        RestTemplate restTemplate = new RestTemplate();
        Currency currency = restTemplate.getForObject("https://api.ratesapi.io/api/latest?base=PLN", Currency.class);

        return prepareMap(currency);
    }

    private static Map<String, Double> prepareMap(Currency currency) {

        Map<String, Double> currencies = new HashMap<>();
        Rates rates = currency.getRates();
        currencies.put("AUD", rates.getAud());
        currencies.put("BGN", rates.getBgn());
        currencies.put("BRL", rates.getBrl());
        currencies.put("CAD", rates.getCad());
        currencies.put("CHF", rates.getChf());
        currencies.put("CNY", rates.getCny());
        currencies.put("DKK", rates.getDkk());
        currencies.put("CZK", rates.getCzk());
        currencies.put("GBP", rates.getGbp());
        currencies.put("HKD", rates.getHkd());
        currencies.put("HRK", rates.getHkd());
        currencies.put("HUF", rates.getHuf());
        currencies.put("IDR", rates.getIdr());
        currencies.put("ILS", rates.getIls());
        currencies.put("INR", rates.getInr());
        currencies.put("ISK", rates.getIsk());
        currencies.put("JPY", rates.getJpy());
        currencies.put("KRW", rates.getKrw());
        currencies.put("MXN", rates.getMxn());
        currencies.put("MYR", rates.getMyr());
        currencies.put("NOK", rates.getNok());
        currencies.put("NZD", rates.getNzd());
        currencies.put("PHP", rates.getPhp());
        currencies.put("PLN", rates.getPln());
        currencies.put("RON", rates.getRon());
        currencies.put("RUB", rates.getRub());
        currencies.put("SEK", rates.getSek());
        currencies.put("SGD", rates.getSgd());
        currencies.put("THB", rates.getThb());
        currencies.put("TRY", rates.getTry());
        currencies.put("USD", rates.getUsd());
        currencies.put("ZAR", rates.getZar());
        return currencies;
    }
}
