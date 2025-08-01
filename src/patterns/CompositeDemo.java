package patterns;

import java.util.*;

interface Component {
    void show();
}

class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Лист: " + name);
    }
}

class Composite implements Component {
    private String name;
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component c) {
        children.add(c);
    }

    public void show() {
        System.out.println("Ветка: " + name);
        for (Component c : children) {
            c.show();
        }
    }
}

class CompositeDemo {
    public static void main(String[] args) {
        Composite root = new Composite("Корень");

        Leaf leaf1 = new Leaf("Лист A");
        Leaf leaf2 = new Leaf("Лист B");

        Composite branch = new Composite("Ветка X");
        branch.add(new Leaf("Лист C"));

        root.add(leaf1);
        root.add(branch);
        root.add(leaf2);

        root.show();
    }
}

