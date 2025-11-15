import com.daniidev.app.ExchangeMenu;
import com.daniidev.exceptions.OpcionInvalidaExcepcion;
import com.daniidev.request.Deserialization;
import com.daniidev.request.Request;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExchangeMenu exchangeMenu = new ExchangeMenu();
        Scanner sc = new Scanner(System.in);
        int n = 0;

        exchangeMenu.welcome();

        // Bucle para validar Y/N
        String yesNo = "";
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("Desea continuar Y/N: ");
            yesNo = sc.nextLine();

            // Validar entrada Y/N
            if (!yesNo.equalsIgnoreCase("Y") && !yesNo.equalsIgnoreCase("N")) {
                try {
                    throw new OpcionInvalidaExcepcion();
                } catch (OpcionInvalidaExcepcion e) {
                    System.out.println("\n⚠️  " + e.getMessage() + "\n");
                    // El bucle continúa, permitiendo reintentar
                }
            } else {
                entradaValida = true; // Entrada válida, salir del bucle
            }
        }

        // Si el usuario eligió N, terminar el programa
        if (yesNo.equalsIgnoreCase("N")) {
            System.out.println("\n╔════════════════════════════════════════════════╗");
            System.out.println("║          Gracias por usar el conversor         ║");
            System.out.println("╚════════════════════════════════════════════════╝\n");
            sc.close();
            return;
        }

        while (n != 7) {
            exchangeMenu.menu();
            n = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            // Validar opción del menú
            if (n < 1 || n > 7) {
                try {
                    throw new OpcionInvalidaExcepcion();
                } catch (OpcionInvalidaExcepcion e) {
                    System.out.println(e.getMessage());
                    continue; // Volver al inicio del bucle
                }
            }

            if (n == 7) {
                System.out.println("\n╔════════════════════════════════════════════════╗");
                System.out.println("║          Gracias por usar el conversor         ║");
                System.out.println("╚════════════════════════════════════════════════╝\n");
                break;
            }

            Request request = new Request();
            String base;
            String target;
            double amount;

            try {
                switch (n) {
                    case 1:
                        base = "USD";
                        target = "EUR";
                        System.out.println("Digite la cantidad de Dólares a convertir: ");
                        amount = sc.nextDouble();
                        sc.nextLine(); // Limpiar buffer

                        Deserialization deserialization = new Deserialization(request.callApi(base, target), amount);
                        System.out.printf("\nLa cantidad $%.2f en Dólares son: €%.2f Euros\n\n", amount, deserialization.getPrice());
                        break;

                    case 2:
                        base = "EUR";
                        target = "USD";
                        System.out.println("Digite la cantidad de Euros a convertir: ");
                        amount = sc.nextDouble();
                        sc.nextLine();

                        deserialization = new Deserialization(request.callApi(base, target), amount);
                        System.out.printf("\nLa cantidad €%.2f en Euros son: $%.2f Dólares\n\n", amount, deserialization.getPrice());
                        break;

                    case 3:
                        base = "USD";
                        target = "COP";
                        System.out.println("Digite la cantidad de Dólares a convertir: ");
                        amount = sc.nextDouble();
                        sc.nextLine();

                        deserialization = new Deserialization(request.callApi(base, target), amount);
                        System.out.printf("\nLa cantidad $%.2f en Dólares son: $%.2f Pesos colombianos\n\n", amount, deserialization.getPrice());
                        break;

                    case 4:
                        base = "COP";
                        target = "USD";
                        System.out.println("Digite la cantidad de Pesos colombianos a convertir: ");
                        amount = sc.nextDouble();
                        sc.nextLine();

                        deserialization = new Deserialization(request.callApi(base, target), amount);
                        System.out.printf("\nLa cantidad $%.2f en Pesos colombianos son: $%.2f Dólares\n\n", amount, deserialization.getPrice());
                        break;

                    case 5:
                        base = "EUR";
                        target = "COP";
                        System.out.println("Digite la cantidad de Euros a convertir: ");
                        amount = sc.nextDouble();
                        sc.nextLine();

                        deserialization = new Deserialization(request.callApi(base, target), amount);
                        System.out.printf("\nLa cantidad €%.2f en Euros son: $%.2f Pesos colombianos\n\n", amount, deserialization.getPrice());
                        break;

                    case 6:
                        base = "COP";
                        target = "EUR";
                        System.out.println("Digite la cantidad de Pesos colombianos a convertir: ");
                        amount = sc.nextDouble();
                        sc.nextLine();

                        deserialization = new Deserialization(request.callApi(base, target), amount);
                        System.out.printf("\nLa cantidad $%.2f en Pesos colombianos son: €%.2f Euros\n\n", amount, deserialization.getPrice());
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error al procesar la conversión: " + e.getMessage());
                sc.nextLine(); // Limpiar buffer en caso de error de entrada
            }
        }

        sc.close();
    }
}