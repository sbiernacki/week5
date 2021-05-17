package pl.writech.week5.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class AuctionApi {

    @GetMapping("/auction")
    public String getFood(Model model) {
        RestTemplate restTemplate = new RestTemplate();

        AuctionResponse[] auctions = restTemplate.getForObject("https://whiskyhunter.net/api/auction_data/catawiki/?format=json", AuctionResponse[].class);

        model.addAttribute("auctions", auctions);
        return "auction";
    }
}
