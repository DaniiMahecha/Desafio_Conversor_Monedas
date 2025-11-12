package com.daniidev.request;

public class Deserialization {
    String base;
    String target;
    double price;

    public Deserialization(DTO dto, double amount) {
        this.base = dto.base_code();
        this.target = dto.target_code();
        this.price = dto.conversion_rate() * amount;
    }

    public String getBase() {
        return base;
    }

    public String getTarget() {
        return target;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Deserialization{" +
                "price=" + price +
                '}';
    }
}
