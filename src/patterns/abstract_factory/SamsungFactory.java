package patterns.abstract_factory;

public class SamsungFactory implements DeviceFactory {
    public Phone createPhone() {
        return new SamsungPhone();
    }
    public Tablet createTablet() {
        return new SamsungTablet();
    }
    public Laptop createLaptop() {
        return new SamsungLaptop();
    }
}