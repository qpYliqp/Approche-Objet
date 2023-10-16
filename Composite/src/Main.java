public class Main {
    public static void main(String[] args) {


    Chocolat choc = new Chocolat();
    Chantilly chant = new Chantilly();
    Gateaux tarte = new Tartes();
    tarte.addIngredient(choc);
    tarte.addIngredient(chant);
    System.out.println(tarte.getDescription());


    }
}