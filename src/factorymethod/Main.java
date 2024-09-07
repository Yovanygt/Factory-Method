package factorymethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que elija el método de pago
        System.out.println("Seleccione el método de pago:");
        System.out.println("1. Tarjeta de Crédito");
        System.out.println("2. PayPal");

        int choice = scanner.nextInt();

        // Declarar la fábrica
        PaymentFactory paymentFactory;

        // Seleccionar la opcion correcta
        switch (choice) {
            case 1:
                paymentFactory = new CreditCardPaymentFactory();
                break;
            case 2:
                paymentFactory = new PaypalPaymentFactory();
                break;
            default:
                System.out.println("Opción no válida.");
                return; // Salir del programa si la opción es inválida
        }

        // Crear el método de pago 
        PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();

        // Pedir al usuario que ingrese el monto a pagar
        System.out.println("Ingrese el monto a pagar:");
        double amount = scanner.nextDouble();

        // Realizar el pago
        paymentMethod.pay(amount);
    }
}
