package com.daniidev.app;

public class ExchangeMenu {
    public void menu(){
        String menu = """
                
                ╔════════════════════════════════════════════════╗
                ║      CONVERSOR DE MONEDAS - Exchange Rate      ║
                ╠════════════════════════════════════════════════╣
                ║                                                ║
                ║  1) Dólar (USD)         ==>  Euro (EUR)        ║
                ║  2) Euro (EUR)          ==>  Dólar (USD)       ║
                ║  3) Dólar (USD)         ==>  Peso Colombiano   ║
                ║  4) Peso Colombiano     ==>  Dólar (USD)       ║
                ║  5) Euro (EUR)         ==>  Peso Colombiano    ║
                ║  6) Peso Colombiano     ==>  Euro (EUR)        ║
                ║                                                ║
                ║  7) Salir                                      ║
                ║                                                ║
                ╚════════════════════════════════════════════════╝
                
                ➤ Elija una opción válida: """;

        System.out.print(menu);
    }

    public void welcome(){
        String welcome = """
                
                ╔════════════════════════════════════════════════╗
                ║                                                ║
                ║        ¡Bienvenido al Conversor de Moneda!     ║
                ║                                                ║
                ║     Realiza conversiones de manera rápida      ║
                ║          y con tasas actualizadas              ║
                ║                                                ║
                ╚════════════════════════════════════════════════╝
                """;

        System.out.println(welcome);
    }


}
