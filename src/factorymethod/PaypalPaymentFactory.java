package factorymethod;

public class PaypalPaymentFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new PaypalPayment();
    }
}