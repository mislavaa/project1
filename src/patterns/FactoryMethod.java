package patterns;

import java.util.Scanner;

interface Delivery {
    void deliver(String address);
}

class AirMail implements Delivery {
    public void deliver(String address) {
        System.out.println("Отправка авиапочтой по адресу: " + address);
    }
}

class GroundMail implements Delivery {
    public void deliver(String address) {
        System.out.println("Отправка наземной почтой по адресу: " + address);
    }
}

abstract class MailService {
    public void send(String address) {
        Delivery delivery = createDelivery();
        delivery.deliver(address);
    }

    protected abstract Delivery createDelivery();
}

class AirMailService extends MailService {
    @Override
    protected Delivery createDelivery() {
        return new AirMail();
    }
}

class GroundMailService extends MailService {
    @Override
    protected Delivery createDelivery() {
        return new GroundMail();
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип доставки:");
        System.out.println("1 — Авиапочта");
        System.out.println("2 — Наземная почта");
        System.out.print("Ваш выбор: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите адрес доставки: ");
        String address = scanner.nextLine();

        MailService service;

        if (choice == 1) {
            service = new AirMailService();
        } else {
            service = new GroundMailService();
        }

        service.send(address);
    }
}
