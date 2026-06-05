package Opcionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        CouponService service = new CouponService();

        Optional<String> coupon = service.findCoupon("JAVA10");

        coupon.ifPresent(value -> System.out.println("Cupón encontrado: " + value));
    }
}