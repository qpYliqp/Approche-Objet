public class Vanille  extends Ingredients{

    public Vanille(Gateaux gateau)
    {
        super(gateau);
    }
    @Override
    public String getDescription() {

        if(gateau.getDescription().contains("Tarte"))
        {
            throw new IllegalArgumentException("Impossible de faire une tarte avec de la vanille");
        }
        return gateau.getDescription() + "à la vanille";
    }
}
