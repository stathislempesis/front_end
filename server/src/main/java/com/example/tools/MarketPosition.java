package com.example.tools;

import java.util.Date;

public class MarketPosition {
    private Date date;
    private float close;
    private float open;

    public MarketPosition() {
    }

    public MarketPosition(Date date, float close, float open) {
        this.date = date;
        this.close = close;
        this.open = open;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getClose() {
        return close;
    }

    public void setClose(float close) {
        this.close = close;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MarketPosition{");
        sb.append("date=").append(date);
        sb.append(", close=").append(close);
        sb.append(", open=").append(open);
        sb.append('}');
        return sb.toString();
    }
}
