public class Main {
    public static void main(String[] args) throws Exception {

        Gateaux test = new Chocolat(new Noisette(new Tartes()));

        System.out.println("Est-ce que ça marche ? "+test.getDescription());
    }
}