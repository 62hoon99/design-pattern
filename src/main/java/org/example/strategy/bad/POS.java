package org.example.strategy.bad;

public class POS {

    private final PG pg = new PG();

    public void pay(int amount, PaymentMethod paymentMethod) {
        double result = 0.0f;

        switch (paymentMethod) {
            case TOSS -> result = amount * 0.9; // 코드에는 단지 할인 뿐이지만 엄청나게 복잡한 계산 로직이 포함되어 있음
            case NAVER -> result = amount * 0.85;
            case KAKAO -> result = amount * 0.9; // 토스와 같은 계산 로직
        }

        pg.pay(result);
    }

    private static class PG {
        void pay(double amount) {
            System.out.println(amount + "원이 결제되었습니다.");
        }
    }
}
