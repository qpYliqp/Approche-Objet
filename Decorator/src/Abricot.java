public class Abricot extends Ingredients {

    public Abricot(Gateaux gateau) {
        super(gateau);
    }

    @Override
    public String getDescription() {
        return gateau.getDescription() + "aux abricots";
    }
}