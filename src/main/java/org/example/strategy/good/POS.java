package org.example.strategy.good;

class POS {

    private final PG pg = new PG();

    public void pay(int amount, PaymentMethod paymentMethod) {
        pg.pay(paymentMethod.calculate(amount));
    }

    private static class PG {
        void pay(double amount) {
            System.out.println(amount + "원이 결제되었습니다.");
        }
    }
}
