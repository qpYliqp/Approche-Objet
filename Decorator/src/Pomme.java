public class Pomme extends Ingredients {

    public Pomme(Gateaux gateau) {
        super(gateau);
    }

    @Override
    public String getDescription() {
        return gateau.getDescription() + ", pommes";
    }
}