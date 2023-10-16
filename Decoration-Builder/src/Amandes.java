public class Amandes extends Ingredients {

    public Amandes(Gateaux gateau) {
        super(gateau);
    }

    @Override
    public String getDescription() {
        return gateau.getDescription() + ", amandes grillées";
    }
}
