package Opcionals;

import java.util.Optional;

class CouponService {

    public Optional<String> findCoupon(String code) {
        if (code.equals("JAVA10")) {
            return Optional.of("10% de descuento");
        }

        return Optional.empty();
    }
}