public class Patissier {

    public static void main(String[] args) {


        Gateaux test = new Chocolat(new Abricot (new Noisette(new Choux())));
        System.out.println("resultat du gateaux : " + test.getDescription());
    }

}
