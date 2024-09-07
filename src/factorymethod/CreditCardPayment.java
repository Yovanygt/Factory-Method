package factorymethod;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Pagado " + amount + " usando La Tarjeta de Crédito.");
    }
}