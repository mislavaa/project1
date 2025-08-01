package patterns.abstract_factory;

public class DeviceStore {
    private final Phone phone;
    private final Tablet tablet;
    private final Laptop laptop;

    public DeviceStore(DeviceFactory factory) {
        phone = factory.createPhone();
        tablet = factory.createTablet();
        laptop = factory.createLaptop();
    }

    public void showDevices() {
        phone.info();
        tablet.info();
        laptop.info();
    }
}