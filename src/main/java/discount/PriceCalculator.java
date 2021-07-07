package discount;

import payments.PaymentResponse;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {
    private List<Double> prices = new ArrayList<>();
    private int discount = 0;

    public double getTotal() {
        double result = 0;
        for (Double price : prices) {
            result += price;
        }
        return result * (discount/100.0);
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
