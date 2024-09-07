package factorymethod;

public class CreditCardPaymentFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCardPayment();
    }
}