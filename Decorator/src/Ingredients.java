public class Ingredients implements Gateaux{

    protected Gateaux gateau;

    public Ingredients(Gateaux gateau)
    {
        super();
        this.gateau = gateau;

    }
    public  String getDescription()
    {
        return gateau.getDescription();
    };


}
