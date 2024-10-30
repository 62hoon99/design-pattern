package org.example.strategy.good;

class ChristmasPaymentStrategy implements PaymentStrategy {
    @Override
    public double pay(int amount) {
        return amount * 0.9;
        // 코드에는 단지 할인 뿐이지만 엄청나게 복잡한 계산 로직이 포함되어 있음
    }
}
