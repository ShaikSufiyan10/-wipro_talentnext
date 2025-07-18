import java.util.Random;

// Abstract class
abstract class abstract1 {
    public abstract String notice();
}

// Derived classes
class FirstClass extends abstract1 {
    public String notice() {
        return "First Class Compartment";
    }
}

class Ladies extends abstract1 {
    public String notice() {
        return "Ladies Compartment";
    }
}

class General extends abstract1 {
    public String notice() {
        return "General Compartment";
    }
}

class Luggage extends abstract1 {
    public String notice() {
        return "Luggage Compartment";
    }
}

// Test class
public class Testabstract1 {
    public static void main(String[] args) {
        abstract1[] compartments = new abstract1[10];
        Random rand = new Random();

        for (int i = 0; i < compartments.length; i++) {
            int randomNum = rand.nextInt(4) + 1;

            switch (randomNum) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        for (int i = 0; i < compartments.length; i++) {
            System.out
