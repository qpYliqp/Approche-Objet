public abstract class Ingredients extends Gateaux {

    protected Gateaux gateau;

    public Ingredients(Gateaux gateau)
    {
        super();
        this.gateau = gateau;

    }
    public abstract String getDescription();
}
