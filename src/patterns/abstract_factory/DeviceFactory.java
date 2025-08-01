package patterns.abstract_factory;

public interface DeviceFactory {
    Phone createPhone();
    Tablet createTablet();
    Laptop createLaptop();
}