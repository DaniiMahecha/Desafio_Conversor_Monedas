package com.daniidev.request.request;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Deserialization {
    String base;
    String target;
    BigDecimal price;

    public Deserialization(DTO dto) {
        this.base = dto.base_code();
        this.target = dto.target_code();

        BigDecimal bigDecimal = new BigDecimal(dto.conversion_rate());
        bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);

        this.price = bigDecimal;
    }

    @Override
    public String toString() {
        return "Deserialization{" +
                "base='" + base + '\'' +
                ", target='" + target + '\'' +
                ", price=" + price +
                '}';
    }
}
