import com.daniidev.app.ExchangeMenu;
import com.daniidev.request.Deserialization;
import com.daniidev.request.Request;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Request request = new Request();
//        System.out.println(request.callApi("EUR", "COP"));
//        Deserialization deserialization = new Deserialization(request.callApi("BRL", "USD"), 250);
//        System.out.println(deserialization);
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
                String base = "";
                String target = "";
                double amount = 1.0;

                switch (n) {
                    case 1:
                        base = "USD";
                        target = "EUR";
                        System.out.println("Digíte la cantidad de Dolares a convertir: ");
                        amount = sc.nextDouble();

                        Deserialization deserialization = new Deserialization(request.callApi(base, target), amount);
                        System.out.printf("%.2f", deserialization.getPrice());
                        break;
                    case 2:
                        base = "EUR";
                        target = "USD";
                        System.out.println("Digíte la cantidad de Euros a convertir: ");
                        amount = sc.nextFloat();

                        deserialization = new Deserialization(request.callApi(base, target), amount);
                        System.out.printf("%.2f", deserialization.getPrice());
                        break;
                    case 3:
                        base = "USD";
                        target = "COP";
                        System.out.println("Digíte la cantidad de Euros a convertir: ");
                        amount = sc.nextFloat();

                        deserialization = new Deserialization(request.callApi(base, target), amount);
                        System.out.printf("%.2f", deserialization.getPrice());
                        break;
                    case 4:
                        base = "COP";
                        target = "USD";
                        System.out.println("Digíte la cantidad de Euros a convertir: ");
                        amount = sc.nextFloat();

                        deserialization = new Deserialization(request.callApi(base, target), amount);
                        System.out.printf("%.2f", deserialization.getPrice());
                        break;
                    case 5:
                        base = "EUR";
                        target = "COP";
                        System.out.println("Digíte la cantidad de Euros a convertir: ");
                        amount = sc.nextFloat();

                        deserialization = new Deserialization(request.callApi(base, target), amount);
                        System.out.printf("%.2f", deserialization.getPrice());
                        break;
                    case 6:
                        base = "COP";
                        target = "EUR";
                        System.out.println("Digíte la cantidad de Euros a convertir: ");
                        amount = sc.nextFloat();

                        deserialization = new Deserialization(request.callApi(base, target), amount);
                        System.out.printf("%.2f", deserialization.getPrice());
                        break;
                }




                } else{
                    break;
            }




        }

    }
}