package factorymethod;

public class PaypalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Pagado " + amount + " usando PayPal, en Linea");
    }
}