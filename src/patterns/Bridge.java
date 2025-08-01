package patterns;

interface Color {
    void applyColor();
}

class RedColor implements Color {
    public void applyColor() {
        System.out.println("Красный цвет");
    }
}

class BlueColor implements Color {
    public void applyColor() {
        System.out.println("Синий цвет");
    }
}

abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Рисуем круг. ");
        color.applyColor();
    }
}

public class Bridge {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        redCircle.draw();

        Shape blueCircle = new Circle(new BlueColor());
        blueCircle.draw();
    }
}
