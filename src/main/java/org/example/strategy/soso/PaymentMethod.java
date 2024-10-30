package org.example.strategy.soso;

enum PaymentMethod {

    // 코드에는 단지 할인 뿐이지만 엄청나게 복잡한 계산 로직이 포함되어 있음
    KAKAO {
        @Override
        double calculate(int amount) {
            return amount * 0.9;
        }
    },
    NAVER {
        @Override
        double calculate(int amount) {
            return amount * 0.85;
        }
    },
    TOSS {
        @Override
        double calculate(int amount) {
            return amount * 0.9; // 토스와 같은 계산 로직
        }
    };

    abstract double calculate(int amount);
}
