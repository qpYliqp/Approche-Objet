public class Chantilly extends Ingredients{

    public Chantilly(Gateaux gateau)
    {
        super(gateau);
    }
    @Override
    public String getDescription() {
        return gateau.getDescription() + ", chantilly";
    }
}
