import com.automobile.twowheeler.Hero;
import com.automobile.fourwheeler.Honda;

public class TestVehicale {
    public static void main(String[] args) {
        Hero heroBike = new Hero();
        System.out.println("Hero Bike Details:");
        System.out.println("Model Name: " + heroBike.getModelName());
        System.out.println("Reg Number: " + heroBike.getRegistrationNumber());
        System.out.println("Owner Name: " + heroBike.getOwnerName());
        System.out.println("Speed: " + heroBike.getSpeed() + " km/h");
        heroBike.radio();

        System.out.println("\nHonda Car Details:");
        Honda hondaCar = new Honda();
        System.out.println("Model Name: " + hondaCar.getModelName());
        System.out.println("Reg Number: " + hondaCar.getRegistrationNumber());
        System.out.println("Owner Name: " + hondaCar.getOwnerName());
        System.out.println("Speed: " + hondaCar.getSpeed() + " km/h");
        hondaCar.cdplayer();
    }
}

