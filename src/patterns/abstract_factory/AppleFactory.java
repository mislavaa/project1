package patterns.abstract_factory;

public class AppleFactory implements DeviceFactory {
    public Phone createPhone() {
        return new ApplePhone();
    }
    public Tablet createTablet() {
        return new AppleTablet();
    }
    public Laptop createLaptop() {
        return new AppleLaptop();
    }
}