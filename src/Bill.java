import java.util.ArrayList;
import java.util.Scanner;

public class Bill {

    private ArrayList<Product> products = new ArrayList<>();

    public void createWeightedProduct() {
        Scanner unos = new Scanner(System.in);
        WeightedProduct product = new WeightedProduct();

        System.out.println("Unesite zeljeni proizvod:");
        String name = unos.nextLine();
        product.setName(name);

        System.out.println("Unesite cenu");
        int price = unos.nextInt();
        product.setPrice(price);

        System.out.println("Unesite kolicinu");
        int quantity = unos.nextInt();
        product.setQuantity(quantity);

        System.out.println("Unesite jedinicu mere");
        String unitOfMeasure = unos.next();
        product.setUnitOfMeasure(unitOfMeasure);

        products.add(product);
    }

    public void createSingleProduct() {
        Scanner unos = new Scanner(System.in);
        SingleProduct product = new SingleProduct();
        System.out.println("Unesite zeljeni proizvod:");

        String name = unos.nextLine();
        product.setName(name);

        System.out.println("Unesite cenu");
        int price = unos.nextInt();
        product.setPrice(price);

        System.out.println("Unesite kolicinu");
        int quantity = unos.nextInt();
        product.setQuantity(quantity);

        products.add(product);
    }

    public void izvestaj(){
        int ukupnaCena = 0;

        StringBuilder bilderracuna = new StringBuilder();
        for (Product p : products) {
            bilderracuna.append(p.getName());
            bilderracuna.append("        ");
            bilderracuna.append("Cena za jedan " + p.getPrice());
            bilderracuna.append("        ");
            bilderracuna.append("Kolicina:" +p.getQuantity());
            bilderracuna.append("\n");
            ukupnaCena += p.getPrice() * p.getQuantity();
        }
        bilderracuna.append("Ukupna cena: ").append(ukupnaCena).append(" dinara\n");
        System.out.println(bilderracuna);
    }

}
