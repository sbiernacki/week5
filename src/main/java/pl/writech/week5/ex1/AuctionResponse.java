package pl.writech.week5.ex1;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuctionResponse {

    @JsonProperty("dt")
    private String dt;
    @JsonProperty("winning_bid_max")
    private Double winningBidMax;
    @JsonProperty("winning_bid_min")
    private Double winningBidMin;
    @JsonProperty("winning_bid_mean")
    private Double winningBidMean;
    @JsonProperty("auction_trading_volume")
    private Double auctionTradingVolume;
    @JsonProperty("auction_lots_count")
    private Integer auctionLotsCount;
    @JsonProperty("all_auctions_lots_count")
    private Integer allAuctionsLotsCount;
    @JsonProperty("auction_name")
    private String auctionName;
    @JsonProperty("auction_slug")
    private String auctionSlug;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dt")
    public String getDt() {
        return dt;
    }

    @JsonProperty("dt")
    public void setDt(String dt) {
        this.dt = dt;
    }

    @JsonProperty("winning_bid_max")
    public Double getWinningBidMax() {
        return winningBidMax;
    }

    @JsonProperty("winning_bid_max")
    public void setWinningBidMax(Double winningBidMax) {
        this.winningBidMax = winningBidMax;
    }

    @JsonProperty("winning_bid_min")
    public Double getWinningBidMin() {
        return winningBidMin;
    }

    @JsonProperty("winning_bid_min")
    public void setWinningBidMin(Double winningBidMin) {
        this.winningBidMin = winningBidMin;
    }

    @JsonProperty("winning_bid_mean")
    public Double getWinningBidMean() {
        return winningBidMean;
    }

    @JsonProperty("winning_bid_mean")
    public void setWinningBidMean(Double winningBidMean) {
        this.winningBidMean = winningBidMean;
    }

    @JsonProperty("auction_trading_volume")
    public Double getAuctionTradingVolume() {
        return auctionTradingVolume;
    }

    @JsonProperty("auction_trading_volume")
    public void setAuctionTradingVolume(Double auctionTradingVolume) {
        this.auctionTradingVolume = auctionTradingVolume;
    }

    @JsonProperty("auction_lots_count")
    public Integer getAuctionLotsCount() {
        return auctionLotsCount;
    }

    @JsonProperty("auction_lots_count")
    public void setAuctionLotsCount(Integer auctionLotsCount) {
        this.auctionLotsCount = auctionLotsCount;
    }

    @JsonProperty("all_auctions_lots_count")
    public Integer getAllAuctionsLotsCount() {
        return allAuctionsLotsCount;
    }

    @JsonProperty("all_auctions_lots_count")
    public void setAllAuctionsLotsCount(Integer allAuctionsLotsCount) {
        this.allAuctionsLotsCount = allAuctionsLotsCount;
    }

    @JsonProperty("auction_name")
    public String getAuctionName() {
        return auctionName;
    }

    @JsonProperty("auction_name")
    public void setAuctionName(String auctionName) {
        this.auctionName = auctionName;
    }

    @JsonProperty("auction_slug")
    public String getAuctionSlug() {
        return auctionSlug;
    }

    @JsonProperty("auction_slug")
    public void setAuctionSlug(String auctionSlug) {
        this.auctionSlug = auctionSlug;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
