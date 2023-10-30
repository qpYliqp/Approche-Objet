public class Patissier {

    public static void main(String[] args) {


        Gateaux test = new Chantilly(new Chocolat(new Abricot (new Noisette(new Choux()))));
        System.out.println("\n\n\nresultat du gateaux : " + test.getDescription()+"\n\n\n");
    }

}
