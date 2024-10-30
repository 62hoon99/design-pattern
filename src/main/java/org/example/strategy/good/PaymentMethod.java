package org.example.strategy.good;

enum PaymentMethod {

    KAKAO(new ChristmasPaymentStrategy()),
    NAVER(new WinterPaymentStrategy()),
    TOSS(new ChristmasPaymentStrategy());

    private final PaymentStrategy paymentStrategy;

    PaymentMethod(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public double calculate(int amount) {
        return paymentStrategy.pay(amount);
    }
}
