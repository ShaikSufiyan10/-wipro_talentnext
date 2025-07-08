package oops_concept;

public class oops3{
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit orange = new Orange();

        apple.eat();
        orange.eat();
    }
}

// Base class
class Fruit {
    String name;
    String taste;
    String size;

    void eat() {
        System.out.println("Eating " + name + " which tastes " + taste);
    }
}

// Apple class
class Apple extends Fruit {
    Apple() {
        name = "Apple";
        taste = "Sweet";
        size = "Medium";
    }

    @Override
    void eat() {
        System.out.println("Apple tastes " + taste);
    }
}

// Orange class
class Orange extends Fruit {
    Orange() {
        name = "Orange";
        taste = "Sour";
        size = "Small";
    }

    @Override
    void eat() {
        System.out.println("Orange tastes " + taste);
    }
}
