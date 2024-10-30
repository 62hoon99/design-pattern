package org.example.strategy.good;

class WinterPaymentStrategy implements PaymentStrategy {

    @Override
    public double pay(int amount) {
        return amount * 0.85;
    }
}
