public class Patissier {

    public static void main(String[] args) {


        GateauxFactory factory = new TartePommeAmande();
        factory.Creation();
        System.out.println("\n\n\n" + factory.getGateaux().getDescription() +"\n\n\n");
    }

}
