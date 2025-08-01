package patterns.abstract_factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите производителя:");
        System.out.println("1 — Apple");
        System.out.println("2 — Samsung");
        System.out.print("Ваш выбор: ");
        int choice = scanner.nextInt();

        DeviceFactory factory;

        if (choice == 1) {
            factory = new AppleFactory();
        } else {
            factory = new SamsungFactory();
        }

        DeviceStore store = new DeviceStore(factory);
        System.out.println("Ваши устройства:");
        store.showDevices();
    }
}