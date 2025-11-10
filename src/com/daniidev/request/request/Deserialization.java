package com.daniidev.request.request;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Deserialization {
    String base;
    String target;
    double price;

    public Deserialization(DTO dto, int amount) {
        this.base = dto.base_code();
        this.target = dto.target_code();
        this.price = dto.conversion_rate() * amount;
    }

    @Override
    public String toString() {
        return "Deserialization{" +
                "price=" + price +
                '}';
    }
}
