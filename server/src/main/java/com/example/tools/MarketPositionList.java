package com.example.tools;

import java.util.ArrayList;
import java.util.List;

public class MarketPositionList {

    private List<MarketPosition> marketPositions = new ArrayList<MarketPosition>();

    public MarketPositionList() {
    }

    public MarketPositionList(List<MarketPosition> marketPositions) {
        this.marketPositions = marketPositions;
    }

    public List<MarketPosition> getMarketPositions() {
        return marketPositions;
    }

    public void setMarketPositions(List<MarketPosition> marketPositions) {
        this.marketPositions = marketPositions;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MarketPositionList{");
        sb.append("marketPositions=").append(marketPositions);
        sb.append('}');
        return sb.toString();
    }
}
