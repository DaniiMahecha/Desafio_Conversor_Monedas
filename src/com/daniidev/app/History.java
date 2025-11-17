package com.daniidev.app;

import com.daniidev.request.Deserialization;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class History {
    String base;
    String target;
    double price;
    double amount;
    String date;

    public History(Deserialization deserialization) {
        this.base = deserialization.getBase();
        this.target = deserialization.getTarget();
        this.price = deserialization.getPrice();
        this.amount = deserialization.getAmount();
        this.date = "";
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

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    private String getSymbolForCurrency(String currency) {
        if (currency.equalsIgnoreCase("USD") || currency.equalsIgnoreCase("COP")) {
            return "$";
        } else if (currency.equalsIgnoreCase("EUR")) {
            return "€";
        }
        return ""; // default
    }

    public boolean saveHistorical() {
        try (FileWriter writer = new FileWriter("historical.txt", true)) {

            String symbolBase = getSymbolForCurrency(getBase());
            String symbolTarget = getSymbolForCurrency(getTarget());

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String timestamp = LocalDateTime.now().format(formatter);


            String text = String.format("[%s] Conversión de %s%.2f %s a %s%.2f %s%n",
                    timestamp,
                    symbolBase, getAmount(), getBase(),
                    symbolTarget, getPrice(), getTarget()
            );

            writer.write(text);
            return true;

        } catch (IOException e) {
            e.printStackTrace(); // ⚠️ mejor para aprendizaje que lanzar RuntimeException
            return false;
        }
    }


}
