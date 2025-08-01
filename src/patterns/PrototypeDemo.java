package patterns;

interface Prototype {
    Prototype clone();
}

class Animal implements Prototype {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Prototype clone() {
        return new Animal(this.name, this.age);
    }

    public void sayInfo() {
        System.out.println("Животное: " + name + ", возраст: " + age);
    }
}

public class PrototypeDemo {
    public static void main(String[] args) {
        Animal original = new Animal("Тигр", 5);
        Animal copy = (Animal) original.clone();

        System.out.println("Оригинал:");
        original.sayInfo();

        System.out.println("Копия:");
        copy.sayInfo();
    }
}

