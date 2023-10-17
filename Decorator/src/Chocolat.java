public class Chocolat extends Ingredients{

    public Chocolat(Gateaux gateau)
    {
        super(gateau);
    }
    @Override
    public String getDescription() {
        return gateau.getDescription() + ", chocolat";
    }
}
