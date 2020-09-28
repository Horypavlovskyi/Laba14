package ua.zp.brainacad;

import java.util.Objects;

public class Shop {
    private String name;
    private String address;
    private Manager manager;
    private Cashier cashier;
    private Security security;
    private Customer customer;

    public void open(){
        System.out.println("Shop Open");
    }
    public void launch(){
        System.out.println("Go to the Launch");
    }
    public void sellProduct(){
        System.out.println("Sell Product");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(name, shop.name) &&
                Objects.equals(address, shop.address) &&
                Objects.equals(manager, shop.manager) &&
                Objects.equals(cashier, shop.cashier) &&
                Objects.equals(security, shop.security) &&
                Objects.equals(customer, shop.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, manager, cashier, security, customer);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", manager=" + manager +
                ", cashier=" + cashier +
                ", security=" + security +
                ", customer=" + customer +
                '}';
    }
}
