package org.example.strategy.bad;

public class Cashier {

    private final POS pos;

    public Cashier(POS pos) {
        this.pos = pos;
    }

    public void pay(ShoppingCart shoppingCart, PaymentMethod paymentMethod) {
        pos.pay(shoppingCart.totalAmount(), paymentMethod);
    }
}
