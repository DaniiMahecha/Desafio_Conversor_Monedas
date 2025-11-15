import com.daniidev.app.ExchangeMenu;
import com.daniidev.request.Deserialization;
import com.daniidev.request.Request;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExchangeMenu exchangeMenu = new ExchangeMenu();
        Scanner sc = new Scanner(System.in);
        int n = 0;

        exchangeMenu.welcome();
        System.out.println("Desea continuar Y/N: ");
        var yesNo = sc.nextLine();

        while (n != 7){

            if (yesNo.equalsIgnoreCase("Y")){
                exchangeMenu.menu();
                System.out.println("Seleccione una opción: ");
                n = sc.nextInt();
                sc.nextLine();

                Request request = new Request();
                String base;
                String target;
                double amount;

                switch (n) {
                    case 1:
                        base = "USD";
                        target = "EUR";
                        System.out.println("Digíte la cantidad de Dolares a convertir: ");
                        amount = sc.nextDouble();

                        Deserialization deserialization = new Deserialization(request.callApi(base, target), amount);
                        System.out.printf("La cantidad $%.2f en Dolares son: $%.2f Euros", amount, deserialization.getPrice());
                        break;
                    case 2:
                        base = "EUR";
                        target = "USD";
                        System.out.println("Digíte la cantidad de Euros a convertir: ");
                        amount = sc.nextDouble();

                        deserialization = new Deserialization(request.callApi(base, target), amount);
                        System.out.printf("La cantidad $%.2f en Euros son: $%.2f Dolares", amount, deserialization.getPrice());
                        break;
                    case 3:
                        base = "USD";
                        target = "COP";
                        System.out.println("Digíte la cantidad de Euros a convertir: ");
                        amount = sc.nextDouble();

                        deserialization = new Deserialization(request.callApi(base, target), amount);
                        System.out.printf("La cantidad $%.2f en Dolares son: $%.2f Pesos colombianos", amount, deserialization.getPrice());
                        break;
                    case 4:
                        base = "COP";
                        target = "USD";
                        System.out.println("Digíte la cantidad de Euros a convertir: ");
                        amount = sc.nextDouble();

                        deserialization = new Deserialization(request.callApi(base, target), amount);
                        System.out.printf("La cantidad $%.2f en Pesos colombianos son: $%.2f Dolares", amount, deserialization.getPrice());
                        break;
                    case 5:
                        base = "EUR";
                        target = "COP";
                        System.out.println("Digíte la cantidad de Euros a convertir: ");
                        amount = sc.nextDouble();

                        deserialization = new Deserialization(request.callApi(base, target), amount);
                        System.out.printf("La cantidad $%.2f en Euros son: $%.2f Pesos colombianos", amount, deserialization.getPrice());
                        break;
                    case 6:
                        base = "COP";
                        target = "EUR";
                        System.out.println("Digíte la cantidad de Euros a convertir: ");
                        amount = sc.nextDouble();

                        deserialization = new Deserialization(request.callApi(base, target), amount);
                        System.out.printf("La cantidad $%.2f en Pesos colombianos son: $%.2f Euros", amount, deserialization.getPrice());
                        break;
                }




                } else{
                System.out.println("Programa finalizado");
                    break;
            }




        }
        sc.close();
    }
}