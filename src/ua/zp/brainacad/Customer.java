package ua.zp.brainacad;

import java.util.Objects;

public class Customer extends Human {
    private String discount;
    private double money;

    public Customer(String fullName, String telephone) {
        super(fullName, telephone);
    }

    public void knowProduct() {
        System.out.println("Клиенты узнают о продукте");
    }
    public void buy() {
        System.out.println("Клиент покупает товар");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return Double.compare(customer.money, money) == 0 &&
                Objects.equals(discount, customer.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount, money);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "discount='" + discount + '\'' +
                ", money=" + money +
                '}';
    }

}
