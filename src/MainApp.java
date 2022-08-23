import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    static {
        System.out.println("Dobro dosli");
    }
    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);
        Bill bill = new Bill();

        System.out.println("Izbor 1-WeightedProduct,2-SingleProduct,0 EXIT:");
        int izbor = unos.nextInt();

        while (izbor != 0) {
            switch (izbor) {
                case 1 -> bill.createWeightedProduct();
                case 2 -> bill.createSingleProduct();
                default -> System.out.println("Pogresan unos");
            }
            System.out.println("Unesite ponovo izbor:");
            izbor = unos.nextInt();
        }
        bill.izvestaj();
    }
}
