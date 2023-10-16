public class Chocolat extends Ingredients{

    public Chocolat(Gateaux gateau)
    {
        super(gateau);
    }
    @Override
    public String getDescription() {
        if(gateau.getDescription().contains("Tarte"))
        {
            throw new IllegalArgumentException("Impossible de faire une tarte avec du chocolat");
        }
        return gateau.getDescription() + ", chocolat";
    }
}
