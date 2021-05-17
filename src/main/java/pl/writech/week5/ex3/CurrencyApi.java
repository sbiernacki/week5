package pl.writech.week5.ex3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class CurrencyApi {

    public static void main(String[] args) {
        getCurrentCurrency();
    }

    public static void getCurrentCurrency() {

        Map<String, Double> currenciesMap = CurrencyService.getCurrencyMap();

        List<String> currencyList = new ArrayList<>(currenciesMap.keySet());
        Collections.shuffle(currencyList);
        String currency = currencyList.stream()
                .findFirst()
                .orElse("PLN");

        BigDecimal currencyValue = BigDecimal.valueOf(currenciesMap.get(currency)).setScale(2, RoundingMode.UP);
        Scanner scanner = new Scanner(System.in);
        BigDecimal input;

        do {
            System.out.println("Wprowadź aktualny kurs " + currency + " uwzględniając 2 miejsca po przecinku");
            input = scanner.nextBigDecimal().setScale(2, RoundingMode.UP);

            if (String.valueOf(input).isBlank()) {
                System.out.println("Niepoprawna wartość.");
            } else if (currencyValue.compareTo(input) > 0) {
                System.out.println("Zbyt mało, spróbuj ponownie.");
            } else if (currencyValue.compareTo(input) < 0) {
                System.out.println("Zbyt dużo, spróbuj ponownie.");
            }
        } while (currencyValue.compareTo(input) != 0);
        System.out.println("Gratulacje poprawna liczba!!");
    }


}
