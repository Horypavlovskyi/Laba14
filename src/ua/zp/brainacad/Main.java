//        1. Наследование. Реализовать иерархию классов с полями и методами
//        2. Реализовать работу методов, эмулируя действия выводом текста в консоль. Например,
//        при выполнении метода «консультировать» выводить на экран текст: «Консультант
//        рассказывает о товаре».
//        3. Переопределить метод «делатьРаботу» для Менеджера, Кассира и Охранника. Внутри
//        каждого из них вывести сообщение, описывающее работу конкретного сотрудника, а
//        также вызвать другие вспомогательные методы.
//        4. Создать класс «Магазин» с композицией из ранее созданных классов.
//        5. Проверить работу магазина. Создать экземпляр класса магазин и выполнить цепочку
//        методов для демонстрации процесса работы магазина:
//        1) Магазин открывается -> все сотрудники приходят на работу
//        2) Магазин начинает продавать товары: клиент узнает про товары -> менеджер
//        делает «свою» работу -> клиент покупает товар -> кассир делает «свою» работу
//        -> охранник делает «свою» работу.
//        3) Магазин закрывается на обед -> сотрудники идут на обед.
//        6. Для всех классов сгенерировать методы: equals, hashcode и toString
//        7. Создать конструктор для класса «Человек», в который передать поля «фио» и «номер
//        телефона». Решить проблемы с конструкторами в дочерних классах


package ua.zp.brainacad;

import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Human human = new Human("Petro Rebro", "098324342");
    Human.hello();
    Human.goodbye();

//    Customer.knowProduct();
//    Customer.buy();

////    Employee.goWork();
//    Employee.lunch();
//    Employee.work();

//    Manager.consult();
//    Manager.talkDiscount();
//    Manager.advice();

//    Cashier.countMoney();

//    Security.talkRadio();
//
//    Shop.open();
//    Shop.launch();
//    Shop.sellProduct();

    Manager manager = new Manager();
    manager.work();
//    manager.consult();
//    manager.talkDiscount();
//    manager.advice();

    Cashier cashier = new Cashier();
    cashier.work();
//    cashier.countMoney();

    Security security = new Security();
    security.work();
//    security.talkRadio();

    Shop shop = new Shop();
    Employee employee = new Employee("Ivan Ivaniv", "0954234234");
    Customer customer = new Customer("Petro Rebro", "0982323232");


    shop.open();
    employee.goWork();

    //2
    shop.sellProduct();
    customer.knowProduct();
    manager.work();
    customer.buy();
    cashier.work();
    security.work();

    //3
    shop.launch();
    employee.lunch();



    }


}
